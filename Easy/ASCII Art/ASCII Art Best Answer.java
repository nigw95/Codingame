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
        int l = in.nextInt();
        in.nextLine();
        int h = in.nextInt();
        in.nextLine();
		
		//Setting string to uppercase
        String t = in.nextLine().toUpperCase();
		
        for (int i = 0; i < h; i++) {
            String row = in.nextLine();
			
			//for every row, find the index of 
			//each letter of the string
            for (int j = 0; j < t.length(); ++j) {
				
				//getting the alphabet number of 
				//the char at j, which is of value
				//0-25 (26 alphabets)
                int p = t.charAt(j) - 'A';
				
				//if p >= 26, means it's not 
				//part of A-Z, so getting
				//the last 'alphabet', which
				//in this case is the "?"
                if (p < 0 || p >= 26) {
                    p = 26;
                }
				
				//printing directly from row input
				//p = position of alphabet
				//l = length of each ascii
				//so in this case, printing from e.g.
				//alphabet p = 15, to alphabet p = 16
                System.out.print(row.substring(l * p, l * (p + 1)));
            }
            System.out.println();
        }
    }
}