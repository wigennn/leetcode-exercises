package com.wigen.algorithm.medium;

/**
 * <p>
 * 129. 求根到叶子节点数字之和
 * 给定一个二叉树，它的每个结点都存放一个 0-9 的数字，每条从根到叶子节点的路径都代表一个数字。
 * <p>
 * 例如，从根到叶子节点路径 1->2->3 代表数字 123。
 * <p>
 * 计算从根到叶子节点生成的所有数字之和。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点
 * </p>
 *
 * @author wangwq
 */
public class Solution129 {

    /**
     * Definition for a binary tree node.
     * <p>
     * }
     */
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {

        int sum = 0;

        public int sumNumbers(TreeNode root) {
            sumChild(0, root);
            return sum;
        }

        private void sumChild(int val, TreeNode root) {
            if (root == null) return;
            int k = val * 10 + root.val;
            if (root.left == null && root.right == null) {
                sum += k;
            }

            sumChild(k, root.left);
            sumChild(k, root.right);
        }
    }
}
