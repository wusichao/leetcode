package com.wusichao.leetcode.dec2019;

import lombok.ToString;

/**
 * @author wusichao
 * @date 2019/12/26 16:45
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        System.out.println(addTwoNumbers(l1, l2));

        /*List<Integer> a = new LinkedList<>();
        a.add(2);a.add(4);a.add(3);*/

    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder a = new StringBuilder();
        ListNode la = l1;
        do {
            a.append(la.val);
            la = la.next;
        } while (la != null);

        StringBuilder b = new StringBuilder();
        ListNode lb = l2;
        do {
            b.append(lb.val);
            lb = lb.next;
        } while (lb != null);

        System.out.println(a.reverse().toString());
        System.out.println(b.reverse().toString());
        Integer sum = Integer.valueOf(a.reverse().toString()) + Integer.valueOf(b.reverse().toString());
        System.out.println(sum.toString());

        String sumStr = sum.toString();
        int length = sumStr.length();
        ListNode l3 = new ListNode(Integer.valueOf(sumStr.substring(length - 1, length--)));

        ListNode ld = null;
        ListNode le = null;
        while (length > 0) {
            ld = new ListNode(Integer.valueOf(sumStr.substring(length - 1, length--)));
            le = ld.next;
            l3.next = ld;
        }
        return l3;
    }

    @ToString
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }
}
