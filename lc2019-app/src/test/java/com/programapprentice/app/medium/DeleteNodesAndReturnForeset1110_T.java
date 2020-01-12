package com.programapprentice.app.medium;

import com.programapprentice.app.model.TreeNode;
import org.junit.Test;

import java.util.List;

public class DeleteNodesAndReturnForeset1110_T {
  DeleteNodesAndReturnForest1110 solution = new DeleteNodesAndReturnForest1110();
  @Test
  public void test1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);

    int[] to_delete = {3, 5};
    List<TreeNode> answer = solution.delNodes(root, to_delete);

  }

  @Test
  public void test2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(3);

    int[] to_delete = {2, 3};
    List<TreeNode> answer = solution.delNodes(root, to_delete);

  }
}
