package com.wigen.algorithm.medium;

import org.junit.Test;

/**
 * <p>
 * 2. 两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * </p>
 *
 * @author wangwq
 */
public class Solution2 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode res = new ListNode(l1.val + l2.val);

            ListNode temp = res;
            ListNode temp1 = l1;
            ListNode temp2 = l2;
            int over = 0;
            while (temp1 != null || temp2 != null) {

                int val = (temp1 == null ? 0: temp1.val) + (temp2 == null ? 0 : temp2.val);
                if (over == 1) {
                    val += 1;
                }
                if ((val / 10) > 0) {
                    over = 1;
                } else {
                    over = 0;
                }
                val = val % 10;
                ListNode t = new ListNode(val);
                temp.next = t;
                temp = temp.next;

                if (temp1 != null) {
                    temp1 = temp1.next;
                }
                if (temp2 != null) {
                    temp2 = temp2.next;
                }
            }

            if (over == 1) {
                temp.next = new ListNode(over);
            }

            System.out.println(res);
            return res.next;
        }
    }

    @Test
    public void test() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution solution = new Solution();
        solution.addTwoNumbers(l1, l2);
    }

    public static void main(String[] args) {
        System.out.println(10/10);
    }
}
