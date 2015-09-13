import java.util.Scanner;

/**
 *
 * Implementing a simple algorithm to Binary Search Tree
 *
 * Not big deal, but just to discover how things work.
 *
 * It could be optimized, O(n*2) isn't that hard, but when you put 1 million rows can be affected by space/time.
 * How to improve it?
 *
 * Well, we have couple of options:
 *  1: Divide the list by odds and evens and if the value is one or the other, divide the odd by two and searching for the value
 *  2: Sort the values in the list applying same principles of first option
 *  3: Using the same principle of fist, delete o(long(n)) of search value not found, reduce space
 *
 * Created by igorcosta on 13/09/15.
 */
public class BinaryTreeSearchImpl {

    public static void main(String[] args){
        int length, els[];
        int i;
        System.out.println("Insert the number of itens in an Array!");
        Scanner read = new Scanner(System.in);
        length = read.nextInt();
        els = new int[length];
        System.out.println("Insert the values");
            for (i = 0;i<length;i++){
                els[i] = read.nextInt();
            }

        // Search an specific value

        int first = 0;
        int last = length - 1;
        int middle = (first + last) /2;
        System.out.println("Search a value you want to find:");
        int search = read.nextInt();
        // O(n*2)

        while(first < last){
            if(els[middle] < search){
                first = middle+1;
            }else if(els[middle] == search){
                System.out.printf("%d was found at %d", search, middle+1);
                break;
            }else{
                last = middle-1;
            }
            middle = (first + last)/2;
        }
        if( first > last){
            System.out.printf("%d value not present at list", search);
        }
    }
}
