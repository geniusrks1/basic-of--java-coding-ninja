public class Solution {
    public static int[] rotateArray(int []a, int x, String dir) {


int n=a.length;
  x = x % n;
        if (x > 0 && dir.equals("LEFT")) {
            rotateLeft(a, n, x);
        } else if (x > 0 && dir.equals("RIGHT")) {
            rotateRight(a, n, x);
        }

return a;

    }


public static void   reverseBetween(int arr[], int start, int end){

while(start<end){
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    start++;
    end--;
}

}



    public static void rotateRight(int[] A, int n, int X) {
        reverseBetween(A, 0, n-1);
        reverseBetween(A, 0, X-1);
        reverseBetween(A, X, n-1);
    }

    public static void rotateLeft(int[] A, int n, int X) {
        reverseBetween(A, 0, n-1);
        reverseBetween(A, 0, n - X-1);
        reverseBetween(A, n - X, n-1);
    }

}
      
