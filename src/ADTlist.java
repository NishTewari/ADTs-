/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adars
 */
public class ADTlist {
//Store all of the integers on the stack

    private int[] stack;
    //keep track of how many items
    private int numItems;

    public ADTlist() {
        stack = new int[10];
        numItems = 0;
    }

    public void push(int item) {
        // if there is room in the stack 
        if (numItems < stack.length) {
            //put the item on the stack 
            stack[numItems] = item;
            numItems++;
        } else {
            //Make more room 
            int[] temp = new int[stack.length * 2];
            //Copy items over
            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }
            //Stack becomes new array
            stack = temp;
            //add item 
            stack[numItems] = item;
            numItems++;
        }
        //Knuth shuffle algorithm 
        for (int i = 0; i < numItems; i++) {
            //generate random spot to swap with 
            int spot = (int) (Math.random() * (numItems - i) + i);
            int temp = stack[i];
            stack[i] = stack[spot];
            stack[spot] = temp;
        }
    }

    public int pop() {
        //get the top item on the stack
        int item = stack[numItems - 1];
        //one less item
        numItems--;
        //give back item 
        return item;
    }

    public int size() {
        return numItems;
    }

    public int peek() {
        return stack[numItems - 1];
    }

    public boolean isEmpty() {
        return numItems == 0;
    }
    public void display(){
        for (int i = 0; i < stack.length; i++) {
            System.out.println(stack[i]);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ADTlist r = new ADTlist();

        r.push(45);
        r.push(56);
        r.push(13);
        r.push(23);
        r.push(67);
        r.push(15);
        
        r.display();
    }

}
