
import java.util.*;
public class Main
{
      public static int maxSubArray(int[] nums) {
          int currSum=nums[0];
          int maxSum=nums[0];
          for(int i=1;i<nums.length;i++){
              currSum=Math.max(nums[i],currSum+nums[i]);
              maxSum=Math.max(currSum,maxSum);
              
          }
          return maxSum;
        
    }
   
    
    public static void main(String[] args){
	 int[] nums1 = {2, 3, 5, -2, 7, -4};
        System.out.println("Max Subarray Sum: " + maxSubArray(nums1)); 
        int[] nums2 = {-2, -3, -7, -2, -10, -4};
        System.out.println("Max Subarray Sum: " + maxSubArray(nums2)); 

        int[] nums3 = {-1, 2, 3, -1, 2, -6, 5};
        System.out.println("Max Subarray Sum: " + maxSubArray(nums3)); 
	   
	  
	}
}
