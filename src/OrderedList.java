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
    private int numItems;

    public OrderedList() {
       head = null;
       numItems = 0;
    }

    public void add(int num) {
    IntNode node = head;   
        for (int position = 0; position < numItems; position++) {
            for (int i = position + 1; i < numItems; i++) {
                
            }
        }
    }

    
    public void remove(int num) {
        
        
    }

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public int get(int pos) {
        return 0;
    }

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
        // TODO code application logic here
    }
}
