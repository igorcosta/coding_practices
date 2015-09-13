package workouts;

import java.util.Scanner;

/**
 *
 * Given an Array of Integer elements, find the odd and even.
 *
 *  Constrains:
 *   Max value of integer typeOf is consider
 *
 * Created by igorcosta on 13/09/15.
 */
public class FindOddAndEven {

    private static Scanner reader;
    private static int[] elements;

    public static void main (String[] args){

        try {
            reader = new Scanner(System.in);
            Write("Insert the Array of elements you want to find, paste separately by commans.");
            String raw_elements = reader.nextLine();
           // fill the values
            elements = new int[raw_elements.split(",").length];

           for(int i=0; i<elements.length; i++){
                elements[i] = Integer.valueOf(raw_elements.split(",")[i]);
            }
            // Find the odd and even
            for( int i= 0; i < elements.length;i++){

                if(elements[i]%2 == 0)
                    Write("Even elements: "+ elements[i]);
                else
                    Write("Odd elements: "+elements[i]);
            }
            Write("Thats's the end folks!");

        }catch (ArrayIndexOutOfBoundsException error){
            throw new Error("Oops!: "+error.getMessage());
        }
    }
    private static void Write(String value){
        System.out.println(value + "\n");
    }

}

