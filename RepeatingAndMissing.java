// Find the repeating and missing number
// Hard
// Given an integer array nums of size n containing values from [1, n] and each value appears exactly once in the array, except for A, which appears twice and B which is missing.
// Return the values A and B, as an array of size 2, where A appears in the 0-th index and B in the 1st index.
// Note: You are not allowed to modify the original array.
// Examples:
// Input: nums = [3, 5, 4, 1, 1]
// Output: [1, 2]
// Explanation: 1 appears two times in the array and 2 is missing from nums
// Input: nums = [1, 2, 3, 6, 7, 5, 7]
// Output: [7, 4]


// -------------------------------------------------------------------------------------------------------------------


import java.util.*;

public class RepeatingAndMissing {
    public static ArrayList<Integer> Solution(int arr[]){
        ArrayList<Integer> NewArr=new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]) NewArr.add(arr[i]);
            if((arr[i+1]-arr[i]>1)) NewArr.add(arr[i]+1); 
            
        }

        return NewArr;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 6, 7, 5, 7};
        System.out.println(Solution(arr));
        
    }
    
}
