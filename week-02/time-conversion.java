import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        //Splitting the string
        String[] arr_s = s.split(":");

        //removing PM or AM
        arr_s[2] = arr_s[2].substring(0,arr_s[2].length()-2);

        if (s.contains("PM"))
        {
            int c = Integer.parseInt(arr_s[0]);
            if (c == 12) //if 12PM then 24 coversion is also 12
            {
                arr_s[0] = "" + c;
            }
            else //else every hour in PM will add 12
            {
                arr_s[0] = "" + (c + 12);
            }
        }
        else if(arr_s[0]=="12") //if 12A.M then it will bw coverted to "00"
        {
            arr_s[0] = "00";
        }
        return arr_s[0]+":"+arr_s[1]+":"+arr_s[2];
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
