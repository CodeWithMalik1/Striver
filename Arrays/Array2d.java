import java.util.Scanner;

class Solution {
    public void setZeroes(int[][] matrix) {
        // Your code goes here
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col] == 0) {
                    for(int col1=0;col1<matrix.length;col1++){
                        matrix[row][col1]=0;
                    }

                }
            }

        }
        
    }

    public static void main(String[] args) {
        // Scanner obj=new Scanner(System.in);
        // int m=obj.nextInt();
        // int n=obj.nextInt();
        int arr[][] = {
                { 1, 1, 1 },
                { 1, 0, 1 }, { 1, 1, 1 }
        };
        setZeroes(arr);
    }
}