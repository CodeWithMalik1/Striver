import java.util.*;

class Main{

public static int[] nextPermutation(int[] nums) {
        // Your code goes here
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
       if(i>=0){
         int j=nums.length-1;
        while(nums[j]<=nums[i]) j--;
        int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
       }
       return nums;
}
public static void main(String args[]) 
{
  int nums[] = {1,2,3};
  int newArr[]=nextPermutation(nums);
  for (int i=0;i<newArr.length;i++){
      System.out.print(newArr[i]+" ");
  } 
}
}
