import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int max_index=0,min_index=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[max_index]){
                max_index=i;
            }
            else if(arr[i]<arr[min_index]){
                min_index=i;
            }
        }
        long minSum=0,maxSum=0;
        for (int i = 0; i < arr.length; i++){
            if(i!=min_index){
                maxSum+=arr[i];
            }
            if(i!=max_index){
                minSum+=arr[i];
            }
        }
        System.out.println(minSum + " " + maxSum);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
