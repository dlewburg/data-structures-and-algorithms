package datastructures.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest
{
  @Test void testAMethod()
    {
      LinkedList sut = new LinkedList();
      System.out.println(sut);
      assertTrue(true);
    }

    @Test public static void testLinkedList() {

    LinkedList list = new LinkedList();
    Assertions.assertEquals("Null", list.toString());

    list.insert(5);
    Assertions.assertEquals("{ 5 }  -> Null", list.toString());
    Assertions.assertEquals(5, list.head.value);

    list.insert(3);
    list.insert(7);
    Assertions.assertEquals("{ 7 } -> { 3 } -> { 5 } -> Null", list.toString());
    Assertions.assertEquals(7, list.head.value);

    Assertions.assertTrue(list.includes(3));

    Assertions.assertFalse(list.includes(10));
    }
}
