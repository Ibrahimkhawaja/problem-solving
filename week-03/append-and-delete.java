import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    //problem link: https://www.hackerrank.com/challenges/append-and-delete/problem
    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
        //Scenario 1:if k does not meet difference
        if((Math.abs(s.length()-t.length()))>k){
            return "No";
        }
        else {
            //Scenario 2:Check that what sub-string must be replaced

            //get minimum for loop
            int min = Math.min(s.length(),t.length());

            //get count of similar characters from beginning
            int count=0;
            for(int i=0;i<min;i++){
                if(s.charAt(i)!=t.charAt(i)){
                    break;
                }
                count++;
            }

            //check if k is greater or equal to the operations needed to replase the required string
            if(((s.length()-count)+(t.length()-count))<=k){
                return "Yes";
            }
            return "No";
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
