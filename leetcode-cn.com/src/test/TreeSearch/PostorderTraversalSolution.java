package test.TreeSearch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Phony on 2018/7/5.
 */
public class PostorderTraversalSolution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        foreach(list, root);
        return list;
    }
    private void foreach(List<Integer> list, TreeNode node) {
        if (null == node) {
            return;
        }
        foreach(list, node.left);
        foreach(list, node.right);
        list.add(node.val);
    }
}
