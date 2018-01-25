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
        // New stack array 
        stack = new int[10];
        // zero number of items at the start.
        numItems = 0;
    }

    public void add(int index, int num) {
        // check if there is room in the array 
        if (numItems + 1 > stack.length) {
            //Make another array for more room  
            int[] temp = new int[stack.length * 2];
            //copy the items from original array to temp array
            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }
            //set original array to temp array
            stack = temp;
        } else {
            // add items to array 
            for (int j = numItems - 1; j >= index; j--) {
                stack[j + 1] = stack[j];
            }
            //set the position to the number being passed through
            stack[index] = num;
            //increase the number of items
            numItems++;
        }
    }
    /**
     * Remove a number at given index
     *
     * @param index
     */
    public void remove(int index) {
        if (index < numItems) {
            //move all number down 1 spot 
            for (int i = index; i < numItems; i++) {
                stack[i] = stack[i + 1];
            }
            //decrease the number of items 
            numItems--;
        }
    }

    /**
     * returns the amount of items
     *
     * @return numItems
     */
    public int size() {
        return numItems;
    }

    /**
     * returns true or false if array is empty or not
     *
     * @return
     */
    public boolean isEmpty() {
        return numItems == 0;
    }

    /**
     * returns the number at a specific index in the array.
     *
     * @param index
     * @return
     */
    public void get(int index) {
        System.out.println(stack[index]);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a ADTlist
        ADTlist r = new ADTlist();
        // random number generator 
        for (int i = 0; i < 10; i++) {
            r.add((int) (Math.random() * 10), (int) (Math.random() * 10));
        }
       
        for (int i = 0; i < r.size(); i++) {
            r.get(i);
        }
    }
}
