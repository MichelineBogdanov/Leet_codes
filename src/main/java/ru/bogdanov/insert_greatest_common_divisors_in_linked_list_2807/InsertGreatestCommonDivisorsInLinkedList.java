package ru.bogdanov.insert_greatest_common_divisors_in_linked_list_2807;

/**
 * Given the head of a linked list head, in which each node contains an integer value.
 * Between every pair of adjacent nodes, insert a new node with a value equal to the greatest common divisor of them.
 * Return the linked list after insertion.
 * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 */
public class InsertGreatestCommonDivisorsInLinkedList {

    public static void main(String[] args) {
        System.out.println(insertGreatestCommonDivisors(
                new ListNode(18,
                        new ListNode(6,
                                new ListNode(10,
                                        new ListNode(3))))));
    }

    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;
        ListNode prev;
        while (cur.next != null) {
            prev = cur;
            cur = cur.next;
            int curVal = cur.val;
            int prevVal = prev.val;
            int gcd = findGCD(curVal, prevVal);
            ListNode listNode = new ListNode(gcd);
            prev.next = listNode;
            listNode.next = cur;
        }
        return head;
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
