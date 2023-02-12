import java.util.*;
public class Solution {
    public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
          Arrays.sort(arr1);
        Arrays.sort(arr2);
     
        int i = 0, j = 0;
     
        int ans = Integer.MAX_VALUE;
     
        while (i < n && j < m)
        {
            if (Math.abs(arr1[i] - arr2[j]) < ans)
              ans = Math.abs(arr1[i] - arr2[j]);
     
            if (arr1[i] < arr2[j])
                i++;
     
            else
               j++;
        }
         
    
        return ans;
    }
    }
