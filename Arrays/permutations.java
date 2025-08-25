public class permutations {
    public static void nextPermutation(int[] nums) {
        // Your code goes here
        int i=nums.length-2;

        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=nums.length-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            // Swap nums[i] and nums[j]
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
         // Reverse the subarray from i+1 to end
         int left=i+1,right=nums.length-1;
         while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
         }

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.err.println();

    }

    public static void main(String[] args) {
        int nums[] = {  3,2,1 };
        nextPermutation(nums);
        printArr(nums);

    }

}
