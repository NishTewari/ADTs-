
import java.util.Stack;

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

    public boolean inLang(String word) {
        //Stack
        Stack<Character> stack = new Stack<Character>();
        //If the dollar sign is not in the middle of the word 
        //RETURN FALSE
        if(word.charAt(word.length() / 2) != '$'){
            return false;
        }
        //break the word into characters
        // add them into the stack. 
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        String rev = "";
        //keep going until its not empty 
        //pops characters from the stack into the reverse String(rev)
        while(!stack.isEmpty()){
            rev += stack.pop();
        }
        // Check if the word equals the reverse word 
        // and Check if there is a dollar sign in the middle 
        if((word.equals(rev)) && word.charAt(word.length() / 2) == '$'){
           // return true
            return true;
        }else{
            // if not then return false 
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringStack t = new StringStack();

        System.out.println(t.inLang("cat$tac"));
        System.out.println(t.inLang("wwes$ww"));
        System.out.println(t.inLang("ra$rt"));
        System.out.println(t.inLang("pat$tap"));
    }

}
