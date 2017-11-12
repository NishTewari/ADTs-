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
        //see if it is first item 
        if (node == null) {
            IntNode temp = new IntNode(num);
            head = temp;
        } else {
            //As you travel to the end, check if the node is less then num
            while (node.getNext() != null && node.getNext().getNum() < num) {
                node = node.getNext();

            }
            //Swap
            IntNode temp = new IntNode(num);
            temp.setNext(node.getNext());
            node.setNext(temp);

        }
        //increases the size counter 
        numItems++;
    }

    public void remove(int d) {
       IntNode node = head;
      
       while(node.getNext()!=null && node.getNum()== d){
           node = node.getNext();
            
       }
      IntNode toRemove = node.getNext();
            //its next node
            IntNode next = toRemove.getNext();
            //set all the links 
            node.setNext(next);
            toRemove.setNext(null);
            numItems--;
    }
   

    public int size() {
        return numItems;
    }

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

        r.add(434);
        r.add(534);
        r.add(42);
        r.add(2);
        r.remove(2);

        for (int i = 0; i < r.size(); i++) {
            System.out.println(r.get(i));

        }
    }
}
