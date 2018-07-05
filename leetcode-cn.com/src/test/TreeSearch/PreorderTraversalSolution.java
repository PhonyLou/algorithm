package test.TreeSearch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Phony on 2018/7/5.
 */
public class PreorderTraversalSolution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        if (root == null) {
            return resList;
        }
        resList.add(root.val);
        // 递归思路，基础条件为无子节点
        if (root.left == null && root.right == null) {
            return resList;
        }
        if (root.left != null) {
            resList.addAll(preorderTraversal(root.left));
        }
        if (root.right != null) {
            resList.addAll(preorderTraversal(root.right));
        }
        return resList;
    }
}
