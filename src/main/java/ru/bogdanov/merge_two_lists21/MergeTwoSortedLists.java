package ru.bogdanov.merge_two_lists21;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        MergeTwoSortedLists mtsl = new MergeTwoSortedLists();
        ListNode listNode = mtsl.mergeTwoLists(list1, list2);
        System.out.println(listNode);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            if (list1 == null) {
                return list2;
            }
            return list1;
        }
        ArrayList<Integer> resList = getIntegers(list1, list2);
        List<Integer> list = resList.stream().sorted().toList();
        ListNode resultTail = new ListNode();
        ListNode resultHead = new ListNode(list.get(0), resultTail);
        for (int i = 1; i < list.size(); i++) {
            resultTail.val = list.get(i);
            if (i != list.size() - 1) {
                resultTail.next = new ListNode();
                resultTail = resultTail.next;
            }
        }
        return resultHead;
    }

    private static ArrayList<Integer> getIntegers(ListNode list1, ListNode list2) {
        ArrayList<Integer> intList1 = new ArrayList<>();
        ArrayList<Integer> intList2 = new ArrayList<>();
        ArrayList<Integer> resList = new ArrayList<>();
        ListNode current1 = list1;
        ListNode current2 = list2;
        do {
            intList1.add(current1.val);
            current1 = current1.next;
        } while (current1 != null);
        do {
            intList2.add(current2.val);
            current2 = current2.next;
        } while (current2 != null);
        resList.addAll(intList1);
        resList.addAll(intList2);
        return resList;
    }

}

