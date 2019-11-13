package com.programapprentice.app.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }

  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    traverse(root, result, 0);
    return result;
  }

  public void traverse(TreeNode root, List<List<Integer>> result, int level) {
    if (root == null) {
      return;
    }

    // add a new level
    if (result.size() <= level) {
      List<Integer> newLevel = new LinkedList<>();
      result.add(newLevel);
    }


    // add value to the level
    List<Integer> curLevel = result.get(level);
    if (level % 2 == 0) {
      curLevel.add(0, root.val);
    } else {
      curLevel.add(root.val);
    }

    traverse(root.left, result, level++);
    traverse(root.right, result, level++);
  }

  public List<List<Integer>> zigzagLevelOrderNonRecursive(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return  result;
    }

    boolean isEvenLevel = false;
    List<TreeNode> curLevel = new ArrayList<>();
    curLevel.add(root);

    while(!curLevel.isEmpty()) {
      List<Integer> level = new ArrayList<>();
      List<TreeNode> nextLevel = new ArrayList<>();
      for(TreeNode node : curLevel) {
        if (isEvenLevel) {
          level.add(0, node.val);
        } else {
          level.add(node.val);
        }
        if (node.left != null) {
          nextLevel.add(node.left);
        }
        if (node.right != null) {
          nextLevel.add(node.right);
        }
      }
      result.add(level);
      isEvenLevel = !isEvenLevel;
      curLevel = nextLevel;
    }

    return result;
  }
}
