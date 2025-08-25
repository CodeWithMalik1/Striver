// Given a 2-D array mat where the elements of each row are sorted in non-decreasing order, and the first element of a row is greater than the last element of the previous row (if it exists), and an integer target, determine if the target exists in the given mat or not.
// Examples:
// Input: mat = [ [1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12] ], target = 8
// Output: True
// Explanation: The target = 8 exists in the 'mat' at index (1, 3).
// Input: mat = [ [1, 2, 4], [6, 7, 8], [9, 10, 34] ], target = 78
// Output: False
// Explanation: The target = 78 does not exist in the 'mat'. Therefore in the output, we see 'false'.

// -------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;

public class Search2DArrray{
    public static boolean searchMatrix(ArrayList<ArrayList<Integer>> matrix, int target) {
        int n = matrix.size();
        int m = matrix.get(0).size();

        //apply binary search:
        int low = 0, high = n * m - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / m, col = mid % m;
            if (matrix.get(row).get(col) == target) return true;
            else if (matrix.get(row).get(col) < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));

        boolean result = searchMatrix(matrix, 8);
        System.out.println(result ? "true" : "false");
    }
}
