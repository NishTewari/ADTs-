/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adars
 */
public class StringStack {

    private String[] stack;
    private int numItems;

    public StringStack() {
        stack = new String[10];
    }

    public void push(String word) {
        // if there is room in the stack 
        if (numItems < stack.length) {
            //put the item on the stack 
            stack[numItems] = word;
            numItems++;
        } else {
            //Make more room 
            String[] temp = new String[stack.length * 2];
            //Copy items over
            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }
            //Stack becomes new array
            stack = temp;
            //add item 
            stack[numItems] = word;
            numItems++;
        }

    }

    public static boolean inLang(String word) {

        //Split word
        String first = word.substring(0, word.indexOf("$"));
        String last = word.substring(word.indexOf("$") + 1, word.length());
        String rWord = "";
        for (int i = last.length() - 1; i >= 0; i--) {
            rWord = rWord + last.charAt(i);

        }

        //Check if first half of word is equal to the reverse word
        if (first.equals(rWord)) {
            return true;

        } else {
            return false;
        }

    }

    public void display() {
        for (int i = 0; i < numItems; i++) {
            System.out.println(stack[i] + "");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringStack t = new StringStack();
        String word = "hellow$ir";
        t.push(word);

        if (inLang(word)) {
            System.out.println(word + " is true");

        } else {
            System.out.println(word + " is false");
        }

    }

}
