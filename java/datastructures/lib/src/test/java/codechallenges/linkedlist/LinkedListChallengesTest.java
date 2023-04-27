package codechallenges.linkedlist;

import datastructures.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;

import static codechallenges.linkedlist.LinkedListChallenges.zipLists;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListChallengesTest
{
  @Test
  void testAChallenge()
  {
    LinkedListChallenges sut = new LinkedListChallenges();
    sut.linkedListChallenge06();
    System.out.println("test something here");
    assertTrue(true);
  }

//  @Test
//  void testTwoEmptyLinkedList()
//  {
//    LinkedList list1 = new LinkedList();
//    LinkedList list2 = new LinkedList();
//    LinkedList expected = new LinkedList();
//    LinkedList result = LinkedListChallenges.zipLists(list1, list2);
//    assertEquals(expected, result);
//  }

  @Test
  public void testZipListsWithTwoListsOfEqualLength() {
    LinkedList list1 = new LinkedList();
    list1.append(1);
    list1.append(3);
    list1.append(5);
    LinkedList list2 = new LinkedList();
    list2.append(2);
    list2.append(4);
    list2.append(6);
    LinkedList result = zipLists(list1, list2);
    assertEquals("1 -> 2 -> 3 -> 4 -> 5 -> 6 -> ", result.toString());
  }

  @Test
  public void testZipListsWithTwoListsOfUnequalLength() {
    LinkedList list1 = new LinkedList();
    list1.append(1);
    list1.append(3);
    LinkedList list2 = new LinkedList();
    list2.append(2);
    list2.append(4);
    list2.append(6);
    LinkedList result = zipLists(list1, list2);
    assertEquals("1 -> 2 -> 3 -> 4 -> 6 -> ", result.toString());
  }

  @Test
  public void testZipListsWithOneEmptyList() {
    LinkedList list1 = new LinkedList();
    LinkedList list2 = new LinkedList();
    list2.append(2);
    list2.append(4);
    list2.append(6);
    LinkedList result = zipLists(list1, list2);
    assertEquals("2 -> 4 -> 6 -> ", result.toString());
  }
}
