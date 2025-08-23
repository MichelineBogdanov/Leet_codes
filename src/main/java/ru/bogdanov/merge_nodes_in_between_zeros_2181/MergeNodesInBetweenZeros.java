package ru.bogdanov.merge_nodes_in_between_zeros_2181;

public class MergeNodesInBetweenZeros {

    public static void main(String[] args) {
        System.out.println(mergeNodes(
                new ListNode(0,
                        new ListNode(3,
                                new ListNode(1,
                                        new ListNode(0,
                                                new ListNode(4,
                                                        new ListNode(5,
                                                                new ListNode(2,
                                                                        new ListNode(0))))))))));
    }

    public static ListNode mergeNodes(ListNode head) {
        ListNode cur = head;
        ListNode prev;
        while (cur.next != null) {
            prev = cur;
            cur = cur.next;
            if (cur.val != 0) {
                prev.val += cur.val;
                prev.next = cur.next;
                cur = prev;
            } else if (cur.next == null) {
                prev.next = null;
            }
        }
        return head;
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
