import java.util.*;

public class Main {
    public static int[] twoSum(int []arr, int target) {
        int[] ans = new int[2];
        int n=arr.length;
        ans[0] = ans[1] = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
  public static void main(String[] args){
    int arr[]={1, 6, 2, 10, 3};
    int target=7;
    System.out.println(Arrays.toString(twoSum(arr,target)));
    
  }
}
//output is: [0,1]
