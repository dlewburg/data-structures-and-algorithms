/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
  // Test instantiation of empty tree
  @Test
  public void testEmptyTree() {
    BinarySearchTree bst = new BinarySearchTree();
    assertNull(bst.getRoot());
  }

  // Test instantiation of tree with a single root node
  @Test
  public void testSingleRootNode() {
    BinarySearchTree bst = new BinarySearchTree();
    bst.add(42);
    assertEquals(42, bst.getRoot().getValue());
  }

  // Test adding left and right children to a node in a binary search tree
  @Test
  public void testAddLeftRightChildren() {
    BinarySearchTree bst = new BinarySearchTree();
    bst.add(50);
    bst.add(30);
    bst.add(70);
    bst.add(20);
    bst.add(40);
    bst.add(60);
    bst.add(80);

    assertEquals(30, bst.getRoot().getLeft().getValue());
    assertEquals(70, bst.getRoot().getRight().getValue());
    assertEquals(20, bst.getRoot().getLeft().getLeft().getValue());
    assertEquals(40, bst.getRoot().getLeft().getRight().getValue());
    assertEquals(60, bst.getRoot().getRight().getLeft().getValue());
    assertEquals(80, bst.getRoot().getRight().getRight().getValue());
  }

  // Test pre-order traversal
  @Test
  public void testPreOrderTraversal() {
    BinarySearchTree bst = new BinarySearchTree();
    bst.add(50);
    bst.add(30);
    bst.add(70);
    bst.add(20);
    bst.add(40);
    bst.add(60);
    bst.add(80);
    List<Integer> traversal = new ArrayList<>();
    bst.preOrder(traversal);
    int[] expected = {50, 30, 20, 40, 70, 60, 80};
    assertArrayEquals(expected, traversal.stream().mapToInt(i -> i).toArray());
  }

  // Test in-order traversal
  @Test
  public void testInOrderTraversal() {
    BinarySearchTree bst = new BinarySearchTree();
    bst.add(50);
    bst.add(30);
    bst.add(70);
    bst.add(20);
    bst.add(40);
    bst.add(60);
    bst.add(80);
    List<Integer> traversal = new ArrayList<>();
    bst.inOrder(traversal);
    int[] expected = {20, 30, 40, 50, 60, 70, 80};
    assertArrayEquals(expected, traversal.stream().mapToInt(i -> i).toArray());
  }

  // Test post-order traversal
  @Test
  public void testPostOrderTraversal() {
    BinarySearchTree bst = new BinarySearchTree();
    bst.add(50);
    bst.add(30);
    bst.add(70);
    bst.add(20);
    bst.add(40);
    bst.add(60);
    bst.add(80);
    List<Integer> traversal = new ArrayList<>();
    bst.postOrder(traversal);
    int[] expected = {20, 40, 30, 60, 80, 70, 50};
    assertArrayEquals(expected, traversal.stream().mapToInt(i -> i).toArray());
  }

  // Test contains method with existing and non-existing node values
  @Test
  public void testContainsMethod() {
    BinarySearchTree bst = new BinarySearchTree();
    bst.add(50);
    bst.add(30);
    bst.add(70);
    bst.add(20);
    bst.add(40);
    bst.add(60);
    bst.add(80);

    assertTrue(bst.contains(50));
    assertTrue(bst.contains(20));
    assertFalse(bst.contains(10));
    assertFalse(bst.contains(90));
  }

  @Test
  public void testFindMaximumValue() {
    BinaryTree tree = new BinaryTree();
    Node root = new Node(50);
    root.setLeft(new Node(30));
    root.setRight(new Node(70));
    root.getLeft().setLeft(new Node(20));
    root.getLeft().setRight(new Node(40));
    root.getRight().setLeft(new Node(60));
    root.getRight().setRight(new Node(80));
    tree.setRoot(root);
    assertEquals(80, tree.findMaximumValue());
  }

}
