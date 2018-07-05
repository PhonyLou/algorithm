package test;

/**
 * Created by Phony on 2018/6/14.
 */

import java.math.BigInteger;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger value1 = convertIntFromNode(l1, BigInteger.valueOf(1));
        BigInteger value2 = convertIntFromNode(l2, BigInteger.valueOf(1));

        value1 = value1.add(value2);
        String str = String.valueOf(value1);
        int val1 = str.charAt(str.length()-1) - '0';
        ListNode node = new ListNode(val1);
        int index = str.length() - 2;
        convertNodeFromInt(str, index, node);

        return node;
    }

    private BigInteger convertIntFromNode(ListNode node, BigInteger weights) {
        BigInteger nodeVal = BigInteger.valueOf(node.val);

        BigInteger initVal = weights.multiply(nodeVal);
        BigInteger nextVal = BigInteger.valueOf(0);
        if (null != node.next) {
            nextVal = convertIntFromNode(node.next, weights.multiply(BigInteger.valueOf(10)));
        }

        return initVal.add(nextVal);
    }

    private void convertNodeFromInt(String str, int index, ListNode node) {
        if (index >= 0) {
            int val = str.charAt(index) - '0';
            ListNode nextNode = new ListNode(val);
            node.next = nextNode;
            index--;
            convertNodeFromInt(str, index, nextNode);
        }
    }
}