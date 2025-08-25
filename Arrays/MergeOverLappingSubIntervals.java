// Merge Overlapping Subintervals
// Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals and return an array of the non-overlapping intervals that cover all the intervals in the input.
// You can return the intervals in any order.
// Examples:
// Input: intervals = [[1,5],[3,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Intervals [1,5] and [3,6] overlap, so they are merged into [1,6].
// Input: intervals = [[5,7],[1,3],[4,6],[8,10]]
// Output: [[1,3],[4,7],[8,10]]
// Explanation: Intervals [4,6] and [5,7] overlap and are merged into [4,7].

import java.util.*;

public class MergeOverLappingSubIntervals {

    public static int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Use a list to store merged intervals
        List<int[]> result = new ArrayList<>();

        // Add the first interval
        int[] current = intervals[0];
        result.add(current);

        // Step 3: Traverse the intervals
        for (int i = 1; i < intervals.length; i++) { // start from 1, since 0th is already in "current"
            int[] interval = intervals[i];

            if (interval[0] <= current[1]) {
                // Overlap -> merge
                current[1] = Math.max(current[1], interval[1]);
            } else {
                // No overlap -> add new interval
                current = interval;
                result.add(current);
            }
        }

        // Convert list back to array
        return result.toArray(new int[result.size()][]);
    }

    public static void printArr(int arr[][]) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 5, 7 }, { 1, 3 }, { 4, 6 }, { 8, 10 } };

        int[][] merged = merge(arr);
        printArr(merged);
    }
}
