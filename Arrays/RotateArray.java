// Given an N * N 2D integer matrix, rotate the matrix by 90 degrees clockwise.
// The rotation must be done in place, meaning the input 2D matrix must be modified directly.
// Examples:
// Input: matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
// Output: matrix = [[7, 4, 1], [8, 5, 2], [9, 6, 3]]

public class RotateArray {
    public static void Rotated(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
                 
            }
        }
            for ( int i = 0; i < arr.length; i++) {
                int left=0,right=arr.length-1;
                while(left<right){
                    int temp=arr[i][left];
                    arr[i][left]=arr[i][right];
                   arr[i][right]=temp;
                   left++;
                   right--;

                }

                
            }
            
        

    }
    public static void printArr(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        
        int arr[][]={
            {1,2,3},{4,5,6},{7,8,9}
        };
        Rotated(arr);
        printArr(arr);
        
        
    }
    
}
