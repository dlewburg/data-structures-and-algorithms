package datastructures.linkedlist;

import com.google.common.annotations.VisibleForTesting;

public class LinkedList
{
  Node head = null;
  //
  public void insert(int value) {
    Node newNode = new Node(value);
    newNode.next = head;
    head = newNode;
  }

  public boolean includes(int value) {
    Node current = head;
    while (current != null){
      if (current.value == value) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  @Override
  public String toString()
    {
      Node current = head;
      String result = "";
      while(current != null){
        result += "{ " + current.value + " } ->";
      }
      result += "NULL";
      return result;
    }

}
