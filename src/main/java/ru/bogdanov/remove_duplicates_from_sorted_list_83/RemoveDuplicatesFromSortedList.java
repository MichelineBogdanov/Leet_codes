package ru.bogdanov.remove_duplicates_from_sorted_list_83;

/**
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
 * Return the linked list sorted as well.
 * Example 1:
 * Input: head = [1,1,2]
 * Output: [1,2]
 * Example 2:
 * Input: head = [1,1,2,3,3]
 * Output: [1,2,3]
 * Constraints:
 * The number of nodes in the list is in the range [0, 300].
 * -100 <= Node.val <= 100
 * The list is guaranteed to be sorted in ascending order.
 */
public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        ListNode list = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3))))));
        ListNode listNode = deleteDuplicates(list);
        System.out.println(listNode);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        int currentVal = head.val;
        ListNode dummyHead = new ListNode(0, head);
        while (head.next != null) {
            if (currentVal == head.next.val) {
                ListNode next = head.next.next;
                head.next.next = null;
                head.next = next;
            } else {
                head = head.next;
                currentVal = head.val;
            }
        }
        return dummyHead.next;
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
        return val + ", " + next;
    }
}
