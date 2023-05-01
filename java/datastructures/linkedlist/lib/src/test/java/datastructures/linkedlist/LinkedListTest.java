package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest
{
  @Test void testAMethod()
    {
      LinkedList sut = new LinkedList();
      System.out.println(sut);
      assertTrue(true);
    }

  @Test public void testInsert() {
    LinkedList list = new LinkedList();
    list.insert(1);
    list.insert(2);
    list.insert(3);
    assertEquals(true, list.includes(1));
    assertEquals(true, list.includes(2));
    assertEquals(true, list.includes(3));
    assertEquals(false, list.includes(4));
  }

  @Test public void testAppend() {
    LinkedList list = new LinkedList();
    list.append(1);
    list.append(2);
    list.append(3);
    assertEquals(true, list.includes(1));
    assertEquals(true, list.includes(2));
    assertEquals(true, list.includes(3));
    assertEquals(false, list.includes(4));
  }

  @Test public void testInsertAfter() {
    LinkedList list = new LinkedList();
    list.insert(1);
    list.insert(2);
    list.insert(3);
    list.insertAfter(2, 4);
    assertEquals(true, list.includes(4));
    assertEquals(false, list.includes(5));
    list.insertAfter(3, 5);
    assertEquals(true, list.includes(5));
    assertEquals(false, list.includes(6));
  }

  @Test public void testInsertBefore(){
    LinkedList list = new LinkedList();
    list.insert(1);
    list.insert(2);
    list.insert(3);
    list.insertBefore(2, 4);
  }
}
