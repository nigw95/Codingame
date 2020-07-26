import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();

        String binary="";

        for (char c : MESSAGE.toCharArray()){
            String bin = Integer.toBinaryString(c);
            String prepend="";

            //7 bits, if less than 7 bits
            //prepend 0 before the binary
            for(int i=bin.length(); i<7;i++){
                prepend+="0";
            }
            
            bin = prepend + bin;

            binary += bin;
        }

    
        char prev='2';
        int count = 0;

        for(char c : binary.toCharArray()){

            if(c != prev){
                //printing out the number of 
                //the previous series
                for(int i=0;i<count;i++)
                    System.out.print("0");

                //print out a space
                //to prepare for the next series
                if(count!=0)
                    System.out.print(" ");

                //the first block of the series
                if(c=='0')
                    System.out.print("00 ");
                else
                    System.out.print("0 ");

                //reset the count
                count = 1;
            } else {
                //if still the same 
                //char, increment the count
                //so that we know when the 
                //series changes, how many 
                //of the first block char
                //there are
                count++;
            }
            prev = c;
        }

        //to print out the final count
        //of the final series
        for(int j=0;j<count;j++){
            System.out.print("0");
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
    }
}