// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;

class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        // code here
        return arr.get(
                arr.size() 
                - (arr.size()/2
                    + arr.size()/4
                )
            );
    }
}


// Driver Code Starts.
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> arr = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                arr.add(Integer.parseInt(token));
            }

            Solution obj = new Solution();
            int res = obj.rotateDelete(arr);

            System.out.println(res);
        }
    }
}
// Driver Code End.
