// Find the Duplicate Number

// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive, there is only one repeated number in nums, return this duplicate number.
// You must not modify the array (assume it is read-only), and you must use only constant extra space.
// Your algorithm should run in less than O(n²) time.
// Examples:
// Input: nums = [1,3,4,2,2]
// Output: 2
// Input: nums = [3,1,3,4,2]
// Output: 3
import java.util.*;
public class DuplicateElement {
    public static int returnDuplicate(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]) return arr[i];
            
        }
         return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        System.out.println(returnDuplicate(arr));
        
    }
    
}
