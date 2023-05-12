package datastructures.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
  private Node root;

  public BinaryTree() {
    root = null;
  }

  public BinaryTree(Node root) {
    this.root = root;
  }

  public void insert(int value) {
    if (root == null) {
      root = new Node(value);
    } else {
      insertHelper(root, value);
    }
  }

  private void insertHelper(Node current, int value) {
    if (value < current.getValue()) {
      if (current.getLeft() == null) {
        current.setLeft(new Node(value));
      } else {
        insertHelper(current.getLeft(), value);
      }
    } else {
      if (current.getRight() == null) {
        current.setRight(new Node(value));
      } else {
        insertHelper(current.getRight(), value);
      }
    }
  }

  public int[] preOrder(List<Integer> traversal) {
    List<Integer> result = new ArrayList<>();
    preOrderHelper(root, result);
    return result.stream().mapToInt(i -> i).toArray();
  }

  private void preOrderHelper(Node current, List<Integer> result) {
    if (current != null) {
      result.add(current.getValue());
      preOrderHelper(current.getLeft(), result);
      preOrderHelper(current.getRight(), result);
    }
  }

  public int[] inOrder(List<Integer> traversal) {
    List<Integer> result = new ArrayList<>();
    inOrderHelper(root, result);
    return result.stream().mapToInt(i -> i).toArray();
  }

  private void inOrderHelper(Node current, List<Integer> result) {
    if (current != null) {
      inOrderHelper(current.getLeft(), result);
      result.add(current.getValue());
      inOrderHelper(current.getRight(), result);
    }
  }

  public int[] postOrder(List<Integer> traversal) {
    List<Integer> result = new ArrayList<>();
    postOrderHelper(root, result);
    return result.stream().mapToInt(i -> i).toArray();
  }

  private void postOrderHelper(Node current, List<Integer> result) {
    if (current != null) {
      postOrderHelper(current.getLeft(), result);
      postOrderHelper(current.getRight(), result);
      result.add(current.getValue());
    }
  }

  public Integer findMaximumValue() {
    if (root == null) {
      return null;
    }
    Node current = root;
    while (current.getRight() != null) {
      current = current.getRight();
    }
    return current.getValue();
  }

  public List<Integer> breadthFirst() {
    List<Integer> result = new ArrayList<>();

    if (root == null) {
      return result;
    }
    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      Node current = queue.poll();
      result.add(current.getValue());
      if (current.getLeft() != null) {
        queue.offer(current.getLeft());
      }
      if (current.getRight() != null) {
        queue.offer(current.getRight());
      }
    }
    return result;
  }

  public Node getRoot() {
    return root;
  }

  public void setRoot(Node root) {
    this.root = root;
  }

  @Override
  public String toString() {
    return "BinaryTree{" +
      "root=" + root +
      '}';
  }
}
