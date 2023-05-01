package datastructures.linkedlist;

import com.google.common.annotations.VisibleForTesting;

public class LinkedList
{
  public codechallenges.linkedlist.Node head;
//  Node head = null;

  public void insert(int value) {
    Node newNode = new Node(value);
    newNode.next = head;
    head = (codechallenges.linkedlist.Node) newNode;
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

  public void append(int value){
    Node newNode = new Node(value);
    if (head == null){
      head = (codechallenges.linkedlist.Node) newNode;
      return;
    }
    Node current = head;
    while (current.next != null){
      current = current.next;
    }
    current.next=newNode;
  }

  public void insertBefore(int value, int newValue){
    Node current = head;
    Node previous = null;

    while (current != null) {
      if (current.value == value) {
        Node newNode = new Node(newValue);
        newNode.next = current;
        if (previous == null) {
          head = (codechallenges.linkedlist.Node) newNode;
        } else {
          previous.next = newNode;
        }
        return;
      }
      previous = current;
      current = current.next;
    }
    current = current.next;
  }

  public void insertAfter(int value, int newValue){
    Node current = head;
    while (current != null) {
      if (current.value == value){
        Node newNode = new Node(newValue);
        newNode.next = current.next;
        current.next = newNode;
        return;
      }
      current = current.next;
    }
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
