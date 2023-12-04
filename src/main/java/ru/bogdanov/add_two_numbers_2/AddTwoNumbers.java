package ru.bogdanov.add_two_numbers_2;

import java.util.ArrayList;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * ---
 * Example 1:
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * ---
 * Example 2:
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * ---
 * Example 3:
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode l2 = new ListNode(2, new ListNode(4, new ListNode(3)));
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode listNode = addTwoNumbers.addTwoNumbers2(l1, l2);
        while (listNode != null) {
            System.out.print(listNode.val + ",");
            listNode = listNode.next;
        }
    }

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        while (l1 != null) {
            first.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            second.add(l2.val);
            l2 = l2.next;
        }
        ListNode next = new ListNode();
        ListNode resultList = new ListNode(0, next);
        boolean isOverflow = false;
        int firstSize = first.size();
        int secondSize = second.size();
        int additionalSize = firstSize - secondSize;
        for (int i = 0; i < Math.abs(additionalSize); i++) {
            if (firstSize > secondSize) {
                second.add(0);
            } else if (firstSize < secondSize) {
                first.add(0);
            }
        }
        for (int i = 0; i < first.size(); i++) {
            int val = first.get(i) + second.get(i);
            if (isOverflow) {
                val++;
            }
            next.val = val % 10;
            isOverflow = val > 9;
            if (i != first.size() - 1 || isOverflow) {
                next.next = new ListNode();
                next = next.next;
                if (i == first.size() - 1 && isOverflow) {
                    next.val = 1;
                }
            }
        }
        return resultList.next;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode next = new ListNode();
        ListNode resultList = new ListNode(0, next);
        int over = 0;
        while (l1 != null || l2 != null || over != 0) {
            int first = l1 != null ? l1.val : 0;
            int second = l2 != null ? l2.val : 0;
            int val = first + second + over;
            over = val / 10;
            next.next = new ListNode(val % 10);
            next = next.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return resultList.next.next;
    }
}
