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
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.

        Map exts = new HashMap();

        for (int i = 0; i < N; i++) {
            exts.put(in.next().toLowerCase(), in.next());
            in.nextLine();
        }

        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine().toLowerCase(); // One file name per line.
            int index = FNAME.lastIndexOf('.');

            String extension="";

            if(index != -1){
                extension = FNAME.substring(index+1,FNAME.length());
            }

            System.out.println((String) exts.getOrDefault(extension, "UNKNOWN"));
        }
    }
}