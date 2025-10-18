package ru.bogdanov.number_of_students_unable_to_eat_lunch_1700;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

/**
 * The school cafeteria offers circular and square sandwiches at lunch break, referred to by numbers 0 and 1 respectively.
 * All students stand in a queue. Each student either prefers square or circular sandwiches.
 * The number of sandwiches in the cafeteria is equal to the number of students. The sandwiches are placed in a stack.
 * At each step:
 * If the student at the front of the queue prefers the sandwich on the top of the stack, they will take it and leave
 * the queue. Otherwise, they will leave it and go to the queue's end.
 * This continues until none of the queue students want to take the top sandwich and are thus unable to eat.
 * <p>
 * You are given two integer arrays students and sandwiches where sandwiches[i] is the type of the i-th sandwich in
 * the stack (i = 0 is the top of the stack) and students[j] is the preference of the j-th student in the initial
 * queue (j = 0 is the front of the queue). Return the number of students that are unable to eat.
 * <p>
 * Example 1:
 * <p>
 * Input: students = [1,1,0,0], sandwiches = [0,1,0,1]
 * <p>
 * Output: 0
 * <p>
 * Explanation:
 * <p>
 * - Front student leaves the top sandwich and returns to the end of the line making students = [1,0,0,1].
 * <p>
 * - Front student leaves the top sandwich and returns to the end of the line making students = [0,0,1,1].
 * <p>
 * - Front student takes the top sandwich and leaves the line making students = [0,1,1] and sandwiches = [1,0,1].
 * <p>
 * - Front student leaves the top sandwich and returns to the end of the line making students = [1,1,0].
 * <p>
 * - Front student takes the top sandwich and leaves the line making students = [1,0] and sandwiches = [0,1].
 * <p>
 * - Front student leaves the top sandwich and returns to the end of the line making students = [0,1].
 * <p>
 * - Front student takes the top sandwich and leaves the line making students = [1] and sandwiches = [1].
 * <p>
 * - Front student takes the top sandwich and leaves the line making students = [] and sandwiches = [].
 * <p>
 * Hence all students are able to eat.
 * <p>
 * Example 2:
 * <p>
 * Input: students = [1,1,1,0,0,1], sandwiches = [1,0,0,0,1,1]
 * <p>
 * Output: 3
 * <p>
 * Constraints:
 * <p>
 * 1 <= students.length, sandwiches.length <= 100
 * <p>
 * students.length == sandwiches.length
 * <p>
 * sandwiches[i] is 0 or 1.
 * <p>
 * students[i] is 0 or 1.
 */
public class NumberOfStudentsUnableToEatLunch {

    public int countStudents(int[] students, int[] sandwiches) {
        int res = students.length;
        int students0Count = 0;
        int students1Count = 0;
        LinkedList<Integer> studentsDeque = new LinkedList<>();
        for (int student : students) {
            studentsDeque.addLast(student);
            if (student == 0) {
                students0Count++;
            } else {
                students1Count++;
            }
        }
        LinkedList<Integer> sandwichesDeque = new LinkedList<>();
        for (int sandwich : sandwiches) {
            sandwichesDeque.addLast(sandwich);
        }
        while (sandwichesDeque.peek() != null) {
            if ((sandwichesDeque.peek() == 0 && students0Count == 0)
                    || (sandwichesDeque.peek() == 1 && students1Count == 0)) {
                break;
            }
            if (Objects.equals(studentsDeque.peek(), sandwichesDeque.peek())) {
                if (studentsDeque.removeFirst() == 0) {
                    students0Count--;
                } else {
                    students1Count--;
                }
                sandwichesDeque.removeFirst();
                res--;
            } else {
                Integer first = studentsDeque.removeFirst();
                studentsDeque.addLast(first);
            }
        }
        return res;
    }

}
