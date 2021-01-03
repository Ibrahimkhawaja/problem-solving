import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    //problem link: https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/copy-from/65139853
    static int beautifulDays(int i, int j, int k) {
        // Complete this function
        int counter=0;
        for (int l = i; l <=j; l++) {

            //create syring builder to get reverse function
            StringBuilder temp=new StringBuilder(Integer.toString(l));

            //get the reverese of the day "l"
            int t=Integer.parseInt(temp.reverse().toString());

            if (((l-t)%k)==0) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}
