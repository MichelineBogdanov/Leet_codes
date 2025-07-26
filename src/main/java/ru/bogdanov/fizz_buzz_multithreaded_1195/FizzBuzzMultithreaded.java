package ru.bogdanov.fizz_buzz_multithreaded_1195;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * You have the four functions:
 * <p>
 * printFizz that prints the word "fizz" to the console,
 * printBuzz that prints the word "buzz" to the console,
 * printFizzBuzz that prints the word "fizzbuzz" to the console, and
 * printNumber that prints a given integer to the console.
 * You are given an instance of the class FizzBuzz that has four functions: fizz, buzz, fizzbuzz and number.
 * The same instance of FizzBuzz will be passed to four different threads:
 * <p>
 * Thread A: calls fizz() that should output the word "fizz".
 * Thread B: calls buzz() that should output the word "buzz".
 * Thread C: calls fizzbuzz() that should output the word "fizzbuzz".
 * Thread D: calls number() that should only output the integers.
 * Modify the given class to output the series [1, 2, "fizz", 4, "buzz", ...] where the ith token (1-indexed) of the series is:
 * <p>
 * "fizzbuzz" if i is divisible by 3 and 5,
 * "fizz" if i is divisible by 3 and not 5,
 * "buzz" if i is divisible by 5 and not 3, or
 * i if i is not divisible by 3 or 5.
 * Implement the FizzBuzz class:
 * <p>
 * FizzBuzz(int n) Initializes the object with the number n that represents the length of the sequence that should be printed.
 * void fizz(printFizz) Calls printFizz to output "fizz".
 * void buzz(printBuzz) Calls printBuzz to output "buzz".
 * void fizzbuzz(printFizzBuzz) Calls printFizzBuzz to output "fizzbuzz".
 * void number(printNumber) Calls printnumber to output the numbers.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 15
 * Output: [1,2,"fizz",4,"buzz","fizz",7,8,"fizz","buzz",11,"fizz",13,14,"fizzbuzz"]
 * <p>
 * Example 2:
 * <p>
 * Input: n = 5
 * Output: [1,2,"fizz",4,"buzz"]
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 50
 */
public class FizzBuzzMultithreaded {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(15);

        Thread thread1 = new Thread(() -> {
            try {
                fizzBuzz.fizz(() -> System.out.print("\"fizz\""));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                fizzBuzz.buzz(() -> System.out.print("\"buzz\""));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread3 = new Thread(() -> {
            try {
                fizzBuzz.fizzbuzz(() -> System.out.print("\"fizzbuzz\""));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread4 = new Thread(() -> {
            try {
                fizzBuzz.number(System.out::print);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

}

class FizzBuzz {
    private volatile int count = 1;
    private static final Semaphore fizzSem = new Semaphore(0);
    private static final Semaphore buzzSem = new Semaphore(0);
    private static final Semaphore fizzBuzzSem = new Semaphore(0);
    private static final Semaphore numSem = new Semaphore(1);
    private int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while (count <= n) {
            fizzSem.acquire();
            if (count > n) {
                return;
            }
            if (count % 3 == 0 && count % 5 != 0) {
                printFizz.run();
                //System.out.println("Count from fizz " + count);
                count++;
                if (count > n) {
                    releaseAll();
                    return;
                }
            }
            fizzSem.release();
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while (count <= n) {
            buzzSem.acquire();
            if (count > n) {
                return;
            }
            if (count % 3 != 0 && count % 5 == 0) {
                printBuzz.run();
                //System.out.println("Count from buzz " + count);
                count++;
                if (count > n) {
                    releaseAll();
                    return;
                }
            }
            buzzSem.release();
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (count <= n) {
            fizzBuzzSem.acquire();
            if (count > n) {
                return;
            }
            if (count % 15 == 0) {
                printFizzBuzz.run();
                //System.out.println("Count from fizzbuzz " + count);
                count++;
                if (count > n) {
                    releaseAll();
                    return;
                }
            }
            fizzBuzzSem.release();
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while (count <= n) {
            numSem.acquire();
            if (count > n) {
                return;
            }
            if (count % 3 != 0 && count % 5 != 0) {
                printNumber.accept(count);
                //System.out.println("Count from num " + count);
                count++;
                if (count > n) {
                    releaseAll();
                    return;
                }
                if (count % 15 == 0) {
                    fizzBuzzSem.release();
                } else if (count % 5 == 0) {
                    buzzSem.release();
                } else if (count % 3 == 0) {
                    fizzSem.release();
                }
            }
            numSem.release();
        }
    }

    private static void releaseAll() {
        numSem.release();
        fizzBuzzSem.release();
        buzzSem.release();
        fizzSem.release();
    }
}
