import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    //problem link: https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=arrays
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        String s="";
        ArrayList<Integer> list = new ArrayList();
        for (int i=0;i <= arr.length-3; i++){
            for (int j=0; j <= arr[0].length-3; j++){
                list.add(getSum(arr,i,j));
            }
        }
        System.out.println(list);
        return Collections.max(list);

    }

    static int getSum(int[][] arr,int x,int y){
        int sum=0;
        for (int i = 0; i < 3; i++){
            sum+=arr[x][y+i];
            sum+=arr[x+2][y+i];
        }
        sum+=arr[x+1][y+1];
        return sum;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
