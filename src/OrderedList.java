/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class OrderedList {

    //Starting - "head"
    private IntNode head;
    //number of items in the list 
    private int numItems;

    public OrderedList() {
        head = null;
        numItems = 0;
    }

    public void add(int num) {
        //start at beginning of list 
        IntNode node = head;
        //create an extra node
        IntNode temp = new IntNode(num);

        //see if it is first item 
        if (node == null) {
            head = temp;
        } else {
            //if the number is less than the head 
            if (num <= head.getNum()) {
                //set it to the front
                temp.setNext(head);
                head = temp;
            } else {                
                    //As you travel to the end, check if the node is less then num
                    while (node.getNext() != null && node.getNext().getNum() <= num) {
                        node = node.getNext();

                    }
                    //Swap
                    temp.setNext(node.getNext());
                    node.setNext(temp);

                }
                //increases the size counter 
                numItems++;
            }
        
    }

    public void remove(int num) {
        //start at beginning of the list 
        IntNode node = head;

        //check to see if the head is the number the user is asking for. 
        if (head.getNum() == num) {
            head = head.getNext();
        }

        while (node.getNext() != null && node.getNum() == num) {
            node = node.getNext();

        }
        IntNode toRemove = node.getNext();
        //its next node
        IntNode next = toRemove.getNext();
        //set all the links 
        node.setNext(next);
        toRemove.setNext(null);
        //once removed, decrease the number of items
        numItems--;
    }

    /**
     * Return the number of items
     *
     * @return numItems
     */
    public int size() {
        return numItems;
    }

    /**
     * return true if there are no items
     *
     * @return
     */
    public boolean isEmpty() {
        return numItems == 0;
    }

    public int get(int pos) {
        IntNode node = head;
        // move the number of times 
        for (int i = 0; i < pos; i++) {
            node = node.getNext();

        }
        return node.getNum();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrderedList r = new OrderedList();

        r.add(300);
        r.add(23);
        r.add(14);
        r.add(90);
        r.add(98);
        r.add(2);
        r.remove(2);

        for (int i = 0; i < r.size(); i++) {
            System.out.println(r.get(i));

        }
    }
}
