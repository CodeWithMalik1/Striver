// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0. You must do it in place.


// Examples:
// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]

// Output: [[1,0,1],[0,0,0],[1,0,1]]

// Explanation:

// Element at position (1,1) is 0, so set entire row 1 and column 1 to 0.

// Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]

// Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

// Explanation:

// There are two zeroes: (0,0) and (0,3).

// Row 0 → all elements become 0
// Column 0 and column 3 → all elements become 0


public class SetMatrixZero {
    public static void main(String[] args) {
        int matrix[][]= {  
            {1,1,1},
            {1,0,1},
            {1,1,1}   };
            int m = matrix.length;
        int n = matrix[0].length;
         // Use first row and first col as markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Zero out cells based on markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
                
            }
            System.out.println();
            
        }
            
   


    }
    
}
