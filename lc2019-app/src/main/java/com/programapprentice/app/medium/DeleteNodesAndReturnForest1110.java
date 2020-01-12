package com.programapprentice.app.medium;

import com.programapprentice.app.model.TreeNode;

import java.util.*;

public class DeleteNodesAndReturnForest1110 {
  Set<Integer> deletes;
  Set<TreeNode> result;
  public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
    deletes = new HashSet<>();
    for(int val : to_delete) {
      deletes.add(val);
    }
    result = new HashSet<TreeNode>();
    result.add(root);
    delete(root, null, null);

    List<TreeNode> answer = new ArrayList<>();
    for(TreeNode node : result) {
      answer.add(node);
    }
    return answer;
  }

  public void delete(TreeNode root, TreeNode parent, Boolean isLeft) {
    if (root == null) {
      return;
    }
    if (deletes.contains(root.val)) {
      if (result.contains(root)) {
        result.remove(root);
      }
      if (parent != null) {
        if (isLeft) {
          parent.left = null;
        } else {
          parent.right = null;
        }
      }
      if (root.left != null) {
        result.add(root.left);
      }
      if (root.right != null) {
        result.add(root.right);
      }
      delete(root.left, root, true);
      delete(root.right, root, false);
      root.left = null;
      root.right = null;
    } else {
      delete(root.left, root, true);
      delete(root.right, root, false);
    }
  }
}
