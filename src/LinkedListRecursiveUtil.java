import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * @author rtv
 */
public class LinkedListRecursiveUtil {

    /**
     * Convert the list to a String such that the
     * result is the same as the toString method.
     */
    public static <Item extends Comparable<? super Item>> String valueOf(LinkedList<? extends Item> list) {





        throw new NotImplementedException();
    }

    /**
     * Write to System.out the list in reverse order WITHOUT modifying the links.
     *  Easy: O(n^2), O(1) space
     *  Easy: O(n), O(n) space
     *  Challenge: O(nlog(n)), O(log(n)) space
     */
    public static <Item extends Comparable<? super Item>> void reverseToString(LinkedList<? extends Item> list) {


        throw new NotImplementedException();

    }


    /**
     * Find needle and return true if it's in the list
     */
    public static <Item extends Comparable<? super Item>> boolean find(LinkedList<? extends Item> list, Item needle) {



        throw new NotImplementedException();
    }

    /**
     * Create a new copy of a list and return the head of the copy
     */
    public static <Item extends Comparable<? super Item>> LinkedList<Item> copy(LinkedList<Item> list) {


        throw new NotImplementedException();
    }


    /**
     * Insert item at the end of the list
     */
    public static <Item extends Comparable<? super Item>> void append(LinkedList<? extends Item> list, Item item) {


        throw new NotImplementedException();

    }


    /**
     * Remove the first occurrence of needle from the list.
     */
    public static <Item extends Comparable<? super Item>> void removeFirst(LinkedList<? extends Item> list, Item needle) {



        throw new NotImplementedException();


    }

    /**
     * Remove every occurrence of needle from the list.
     */
    public static <Item extends Comparable<? super Item>> void removeAll(LinkedList<? extends Item> list, Item needle) {


        throw new NotImplementedException();

    }

    /**
     *  Returns the maximum item in the list or null if the list is empty
     */
    public static <Item extends Comparable<? super Item>> Item max(LinkedList<? extends Item> list) {




        throw new NotImplementedException();
    }




    /**
     * Shuffles the nodes of the list WITH modification of the links.
     *  Easy: O(n^2), O(1) space
     *  Challenge: O(nlgn), O(lgn) space. Hint: divide and conquer
     *
     * Write the test case for this one first :)
     */
    public static <Item extends Comparable<? super Item>> void shuffle(LinkedList<? extends Item> listR) {


        throw new NotImplementedException();

    }

}
