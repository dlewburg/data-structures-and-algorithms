package codechallenges.linkedlist;

import datastructures.linkedlist.LinkedList;

public class LinkedListChallenges {
  LinkedList linkedList;

  public LinkedListChallenges() {
    linkedList = new LinkedList();
  }

  public static LinkedList zipLists(LinkedList list1, LinkedList list2) {
    LinkedList result = new LinkedList();
    Node current1 = list1.head;
    Node current2 = list2.head;

    while (current1 != null && current2 != null) {
      result.append(current1.value);
      result.append(current2.value);
      current1 = (Node) current1.next;
      current2 = (Node) current2.next;
    }

    // Add remaining nodes from list1 if any
    while (current1 != null) {
      result.append(current1.value);
      current1 = (Node) current1.next;
    }

    // Add remaining nodes from list2 if any
    while (current2 != null) {
      result.append(current2.value);
      current2 = (Node) current2.next;
    }

    return result;
  }

  public void linkedListChallenge06() {

  }
}

