/**
 * @author rtv
 */
public class LinkedListRecursiveFunctions {


    /**
     * Return the length of the list
     */
    public static <Item extends Comparable<? super Item>> int length(LinkedList<? extends Item> list) {

        throw new UnsupportedOperationException("Implement and remove this");
    }

    /**
     * Write to System.out the list in order WITHOUT modifying the links.
     * Without using toString of course.
     */
    public static <Item extends Comparable<? super Item>> void print(LinkedList<? extends Item> list) {

        throw new UnsupportedOperationException("Implement and remove this");
    }

    /**
     * Write to System.out the list in reverse order WITHOUT modifying the links.
     * Easy: O(n^2), O(1) space
     * Easy: O(n), O(n) space
     * Challenge: O(nlog(n)), O(log(n)) space
     */
    public static <Item extends Comparable<? super Item>> void printReverse(LinkedList<? extends Item> list) {

        throw new UnsupportedOperationException("Implement and remove this");
    }


    /**
     * Find needle and return the list with needle as the head.
     * Return null if the item cannot be found;
     */
    public static <Item extends Comparable<? super Item>> LinkedList<Item> find(LinkedList<Item> list, Item needle) {

        throw new UnsupportedOperationException("Implement and remove this");
    }

    /**
     * Create a new copy of a list and return the head of the copy
     */
    public static <Item extends Comparable<? super Item>> LinkedList<Item> copy(LinkedList<? extends Item> list) {

        throw new UnsupportedOperationException("Implement and remove this");
    }


    /**
     * Insert item at the end of the list and return the node with that item
     */
    public static <Item extends Comparable<? super Item>> LinkedList<Item> append(LinkedList<Item> list, Item item) {


        throw new UnsupportedOperationException("Implement and remove this");
    }


    /**
     * Remove the first occurrence of needle from the list and return the head of the resulting list.
     */
    public static <Item extends Comparable<? super Item>> LinkedList<Item> removeFirst(LinkedList<Item> list, Item
            needle) {

        throw new UnsupportedOperationException("Implement and remove this");
    }

    /**
     * Remove every occurrence of needle from the list and return the head of the resulting list.
     */
    public static <Item extends Comparable<? super Item>> LinkedList<Item> removeAll(LinkedList<Item> list, Item
            needle) {

        throw new UnsupportedOperationException("Implement and remove this");
    }

    /**
     * Returns the maximum item in the list or null if the list is empty
     */
    public static <Item extends Comparable<? super Item>> Item max(LinkedList<? extends Item> list) {


        throw new UnsupportedOperationException("Implement and remove this");
    }


    /**
     * Shuffles the nodes of the list WITH modification of the links.
     * Easy: O(n^2), O(1) space
     * Challenge: O(nlgn), O(lgn) space. Hint: divide and conquer
     * <p>
     * Write the test case for this one first :)
     */
    public static <Item extends Comparable<? super Item>> void shuffle(LinkedList<? extends Item> listR) {


        throw new UnsupportedOperationException("Implement and remove this");
    }

}
