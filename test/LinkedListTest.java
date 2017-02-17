import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

/**
 * @author rtv
 */
public class LinkedListTest {


    public LinkedList<Integer> head;

    @Before
    public void setUp() throws Exception {

        head = new LinkedList<>();
        LinkedList<Integer> curr = head;
        curr.item = 3;
        curr.next = new LinkedList<>();
        curr = curr.next;

        curr.item = 9;
        curr.next = new LinkedList<>();
        curr = curr.next;

        curr.item = 9;
        curr.next = new LinkedList<>();
        curr = curr.next;

        curr.item = 7;
        curr.next = new LinkedList<>();
        curr = curr.next;

        curr.item = -10;
        curr.next = null;

    }

    @Test
    public void testPrint() throws Exception {

        LinkedListRecursiveUtil.print(head);

    }

    @Test
    public void testPrintReverse() throws Exception {

        LinkedListRecursiveUtil.printReverse(head);

    }

    @Test
    public void testLength() throws Exception {
        assertEquals(5, LinkedListRecursiveUtil.length(head));

        assertEquals(1,LinkedListRecursiveUtil.length(new LinkedList<>()));

        assertEquals(0, LinkedListRecursiveUtil.length(null));
    }


    @Test
    public void testMax() throws Exception {
        assertEquals(Integer.valueOf(9), LinkedListRecursiveUtil.max(head, head.item));

        assertEquals(null, LinkedListRecursiveUtil.max(new LinkedList<>(), null));
    }

    @Test
    public void testRemoveAll() throws Exception {
        head = LinkedListRecursiveUtil.removeAll(head, 11);
        assertEquals("3 => 9 => 9 => 7 => -10 => null", head.toString());

        head = LinkedListRecursiveUtil.removeAll(head, -10);
        assertEquals("3 => 9 => 9 => 7 => null", head.toString());

        head = LinkedListRecursiveUtil.removeAll(head, 3);
        assertEquals("9 => 9 => 7 => null", head.toString());

        head = LinkedListRecursiveUtil.removeAll(head, 9);
        assertEquals("7 => null", head.toString());
    }

    @Test
    public void testRemoveFirst() throws Exception {
        head = LinkedListRecursiveUtil.removeFirst(head, 11);
        assertEquals("3 => 9 => 9 => 7 => -10 => null", head.toString());

        head = LinkedListRecursiveUtil.removeFirst(head, 3);
        assertEquals("9 => 9 => 7 => -10 => null", head.toString());

        head = LinkedListRecursiveUtil.removeFirst(head, 9);
        assertEquals("9 => 7 => -10 => null", head.toString());

        head = LinkedListRecursiveUtil.removeFirst(head, 9);
        assertEquals("7 => -10 => null", head.toString());
    }

    @Test
    public void testAppend() throws Exception {

        LinkedListRecursiveUtil.append(head, 10);
        assertEquals("3 => 9 => 9 => 7 => -10 => 10 => null", head.toString());

        LinkedListRecursiveUtil.append(head, 11);
        assertEquals("3 => 9 => 9 => 7 => -10 => 10 => 11 => null", head.toString());

        LinkedList<Integer> l = new LinkedList<>();
        l.item = 14;
        l.next = null;
        LinkedListRecursiveUtil.append(l, 12);
        assertEquals("14 => 12 => null", l.toString());

        LinkedList<Integer> l1 = LinkedListRecursiveUtil.append(null, 11);
        assertEquals("11 => null", l1.toString());
    }

    @Test
    public void testCopy() throws Exception {

        LinkedList<Integer> copy = LinkedListRecursiveUtil.copy(head);
        assertFalse(head.next == copy.next);
        assertEquals(head.toString(), copy.toString());

        copy.item = 11;
        assertNotEquals(head.toString(), copy.toString());

        LinkedList<Integer> l = new LinkedList<>();
        l.item = 14;
        l.next = null;
        LinkedListRecursiveUtil.copy(l);
        copy = LinkedListRecursiveUtil.copy(l);
        assertEquals("14 => null", copy.toString());

    }

    @Test
    public void testFind() throws Exception {
        LinkedList<Integer> found = LinkedListRecursiveUtil.find(head, -10);
        assertEquals(Integer.valueOf(-10), found.item);

        found = LinkedListRecursiveUtil.find(head, 3);
        assertEquals(Integer.valueOf(3), found.item);

        found = LinkedListRecursiveUtil.find(head, -99);
        assertEquals(null, found);
    }

}


