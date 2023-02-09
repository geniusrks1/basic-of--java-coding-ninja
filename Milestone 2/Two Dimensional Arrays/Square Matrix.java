import javafx.util.Pair;
public class Solution {
    public static Pair< String, int[] > sqrMat(int [][]mat, int n, int m) {
   



        int arr[] = new int[n];
        int k = 0;

        if(n != m){
            
            return new Pair("NO", arr);
        }
        else{
            
            for (int i = 0; i < n; i++) {

                arr[k++] = mat[i][i];
            }
        }
        return new Pair("YES", arr);
    }
}

