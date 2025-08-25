// Given an array nums consisting of only 0, 1, or 2. Sort the array 
// in non-decreasing order. The sorting must be done in-place,
//  without making a copy of the original array.

public class Sorting012 {
    public static void sorted(int arr[]){
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                 int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,1,0,2,2,1,1,0,0};
        sorted(arr);
        printArr(arr);
    }
    
}
