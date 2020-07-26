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
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();
        String rows[] = new String[H];

        char first = 'a';
        char last = 'z';
        char qMark = '?';

        for (int i = 0; i < H; i++) {
            rows[i] = in.nextLine();
        }

        String answer="";

        T = T.toLowerCase();

        for(int k=0;k<H;k++){
            for(char val : T.toCharArray()){

                //print first row of each char

                int start;
                int end;

                if(val >= first && val <=last){
                    start = (val-first) * L;
                    end = start+L;

                    System.out.print(rows[k].substring(start,end));

                } else {
                    start = 26*L; //26 alphabets * length
                    end = start+L;
                    
                    System.out.print(rows[k].substring(start,end));
                }
            }

            //break line here to go to the next line of each char
            System.out.println("");
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
    }
}