/**
 * @author rtv
 */
public class LinkedList<Item extends Comparable<? super Item>> {

    public Item item;
    public LinkedList<Item> next;

    public LinkedList(Item item, LinkedList<Item> next) {
        this.item = item;
        this.next = next;
    }

    public LinkedList() {}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        LinkedList<Item> curr = next;

        while (curr != null) {
            sb.append(curr.item).append(" => ");
            curr = curr.next;
        }
        sb.append("null");
        return sb.toString();
    }

}
