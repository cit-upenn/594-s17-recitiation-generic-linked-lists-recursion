import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * @author rtv
 */
public class LinkedListTest {


    public LinkedList<Integer> head;

    @Before
    public void setUp() throws Exception {

        head = new LinkedList<>();
        LinkedList<Integer> curr = head;

        curr.next = new LinkedList<>();
        curr.next.item = 3;
        curr.next.next = null;
        curr = curr.next;

        curr.next = new LinkedList<>();
        curr.next.item = 9;
        curr.next.next = null;
        curr = curr.next;


        curr.next = new LinkedList<>();
        curr.next.item = 9;
        curr.next.next = null;
        curr = curr.next;

        curr.next = new LinkedList<>();
        curr.next.item = 7;
        curr.next.next = null;
        curr = curr.next;

        curr.next = new LinkedList<>();
        curr.next.item = -10;
        curr.next.next = null;
    }

    @Test
    public void testPrint() throws Exception {
        assertEquals("3 => 9 => 9 => 7 => -10 => null", head.toString());
    }

    @Test
    public void testValueOf() throws Exception {
        assertEquals(head.toString(), LinkedListRecursiveUtil.valueOf(head));

    }

    @Test
    public void testMax() throws Exception {
        assertEquals(Integer.valueOf(9), LinkedListRecursiveUtil.max(head));

        assertEquals(null, LinkedListRecursiveUtil.max(new LinkedList<>()));
    }

    @Test
    public void testRemoveAll() throws Exception {
        LinkedListRecursiveUtil.removeAll(head, 11);
        assertEquals("3 => 9 => 9 => 7 => -10 => null", head.toString());

        LinkedListRecursiveUtil.removeAll(head, -10);
        assertEquals("3 => 9 => 9 => 7 => null", head.toString());

        LinkedListRecursiveUtil.removeAll(head, 3);
        assertEquals("9 => 9 => 7 => null", head.toString());

        LinkedListRecursiveUtil.removeAll(head, 9);
        assertEquals("7 => null", head.toString());
    }

    @Test
    public void testRemoveFirst() throws Exception {
        LinkedListRecursiveUtil.removeFirst(head, 11);
        assertEquals("3 => 9 => 9 => 7 => -10 => null", head.toString());

        LinkedListRecursiveUtil.removeFirst(head, 3);
        assertEquals("9 => 9 => 7 => -10 => null", head.toString());

        LinkedListRecursiveUtil.removeFirst(head, 9);
        assertEquals("9 => 7 => -10 => null", head.toString());

        LinkedListRecursiveUtil.removeFirst(head, 9);
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
        assertEquals("14 => 12 => null", head.toString());

        LinkedListRecursiveUtil.append(null, 11);
        assertEquals("11 => null", head.toString());
    }

    @Test
    public void testCopy() throws Exception {

        LinkedList<Integer> copy = LinkedListRecursiveUtil.copy(head);
        assertFalse(head.next == copy.next);
        assertEquals(head.toString(), copy.toString());

        copy.item = -100;
        assertFalse(head.toString().equals(copy.toString()));

        LinkedList<Integer> l = new LinkedList<>();
        l.item = 14;
        l.next = null;
        LinkedListRecursiveUtil.copy(l);
        copy = LinkedListRecursiveUtil.copy(head);
        assertEquals(l.toString(), copy.toString());

    }

    @Test
    public void testFind() throws Exception {

        assertEquals(true, LinkedListRecursiveUtil.find(head, -10));
        assertEquals(true, LinkedListRecursiveUtil.find(head, 3));
        assertEquals(false, LinkedListRecursiveUtil.find(head, 99));

    }

}


