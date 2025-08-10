package ru.bogdanov.reverse_linked_list_206;

import java.util.ArrayList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        ListNode reversed = reverseList(node);
        while (reversed.next != null) {
            System.out.println(reversed);
            reversed = reversed.next;
        }
        System.out.println(reversed);
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ArrayList<ListNode> nodes = new ArrayList<>();
        while (head.next != null) {
            nodes.add(head);
            head = head.next;
        }
        nodes.add(head);
        for (int i = nodes.size() - 1; i > 0; i--) {
            ListNode node = nodes.get(i);
            node.next = nodes.get(i - 1);
        }
        nodes.get(0).next = null;
        return nodes.get(nodes.size() - 1);
    }

    public static ListNode reverseList2(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        ListNode tmp;
        while (cur != null) {
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
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
                '}';
    }
}
