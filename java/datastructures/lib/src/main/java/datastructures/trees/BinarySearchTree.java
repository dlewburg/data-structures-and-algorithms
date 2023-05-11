package datastructures.trees;


import static javax.swing.SwingUtilities.getRoot;

public class BinarySearchTree extends BinaryTree {
  public BinarySearchTree() {
    super();
  }

  public void add(int value) {
    if (getRoot() == null) {
      setRoot(new Node(value));
    } else {
      addHelper(getRoot(), value);
    }
  }

  private void addHelper(Node current, int value) {
    if (value < current.getValue()) {
      if (current.getLeft() == null) {
        current.setLeft(new Node(value));
      } else {
        addHelper(current.getLeft(), value);
      }
    } else {
      if (current.getRight() == null) {
        current.setRight(new Node(value));
      } else {
        addHelper(current.getRight(), value);
      }
    }
  }

  public boolean contains(int value) {
    return containsHelper(getRoot(), value);
  }

  private boolean containsHelper(Node current, int value) {
    if (current == null) {
      return false;
    } else if (current.getValue() == value) {
      return true;
    } else if (value < current.getValue()) {
      return containsHelper(current.getLeft(), value);
    } else {
      return containsHelper(current.getRight(), value);
    }
  }
}
