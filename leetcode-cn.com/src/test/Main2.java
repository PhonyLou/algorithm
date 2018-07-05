package test;

import java.math.BigInteger;

/**
 * Created by Phony on 2018/6/14.
 */
public class Main2 {
    public static void main(String[] arg) {
        ListNode l1 = new ListNode(5);
//        ListNode l11 = new ListNode(8);
        //ListNode l12 = new ListNode(3);

        ListNode l2 = new ListNode(5);
//        ListNode l21 = new ListNode(6);
//        ListNode l22 = new ListNode(4);
//        ListNode l23 = new ListNode(9);
//        ListNode l24 = new ListNode(9);
//        ListNode l25 = new ListNode(9);
//        ListNode l26 = new ListNode(9);
//        ListNode l27 = new ListNode(9);
//        ListNode l28 = new ListNode(9);
//        ListNode l29 = new ListNode(9);

        //l1.next = l11;
        //l11.next = l12;

//        l2.next = l21;
//        l21.next = l22;
//        l22.next = l23;
//        l23.next = l24;
//        l24.next = l25;
//        l25.next = l26;
//        l26.next = l27;
//        l27.next = l28;
//        l28.next = l29;

        Solution2 solution2 = new Solution2();
        ListNode node = solution2.addTwoNumbers(l1, l2);
        System.out.println(node.val);
        while (null != node.next) {
            node = node.next;
            System.out.println(node.val);
        }
    }
}
