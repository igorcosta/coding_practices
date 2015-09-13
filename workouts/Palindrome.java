package workouts;

import java.util.Scanner;

/**
 *
 * Given a word, check if it's palindrome
 *
 * Don't know what palindrome is? checkout out at https://en.wikipedia.org/wiki/Palindrome
 *
 * Palindrome Words: did, tet, Ana, Arara,ele, matam, ovo, Renner
 * Not palindrome: Words, Program, Does,
 * Created by igorcosta on 13/09/15.
 */
public class Palindrome {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.println("Type the word:");
        char[] word = reader.nextLine().toCharArray();
        if(isPalindromeFast(word)){
            Write(new String(word) + " is Palindrome",false);
        }else{
            Write(new String(word) + " is NOT Palindrome", false);
        }


    }

    private static Boolean isPalindromeFast(char[] word){
            String reverse = "", Original = new String(word);
            for(int i= Original.length() -1;i>=0;i--){
                reverse = reverse + Original.charAt(i);
            }
        if(Original.equals(reverse)){
            return true;
        }
        return false;
    }
    /**
     * @deprecated Found a better way to do that
     */
    private static Boolean isPalindrome(char[] word){

        int wordOne = 0;
        int wordTwo = word.length -1;
        while(wordTwo > wordOne){
            if(word[wordOne] != word[wordTwo]){
                return false;
            }
            ++wordOne;
            --wordTwo;
        }
        return true;
    }
    private static void Write(String value, Boolean formatted){

        if(formatted)
            System.out.printf("%d", value);
        else
            System.out.println(value);
    }
}
