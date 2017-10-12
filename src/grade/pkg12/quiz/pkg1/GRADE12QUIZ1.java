/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.pkg12.quiz.pkg1;

import java.util.Scanner;

/**
 *
 * @author millc9988
 */
public class GRADE12QUIZ1 {
    public String swap(String word,int posA,int posB){
        StringBuilder helper = new StringBuilder(word);
        char save = helper.charAt(posA);
        helper.setCharAt(posA, helper.charAt(posB));
        helper.setCharAt(posB, save);
        word = helper.toString();
        return word;
    }
    public String reverseString(String word,int pass){
        int endpos = pass+1;
        if (pass<word.length()/2) {
            word = swap(word,pass,word.length()-endpos);
            pass++;
        }
        if(pass<word.length()/2){
            return reverseString(word,pass);
        }else{
            return word;
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GRADE12QUIZ1 call = new GRADE12QUIZ1();
        System.out.println("Please enter your word.");
        String word = in.nextLine();
        System.out.println("your word reversed is "+call.reverseString(word,0));
    }
}
