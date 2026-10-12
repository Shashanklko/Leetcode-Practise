class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Edge case check
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Imagine the 2D matrix is flattened into a 1D array of size (rows * cols)
        int start = 0;
        int end = (rows * cols) - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

           
            int r = mid / cols;
            int c = mid % cols;

            int midValue = matrix[r][c];

            if (midValue == target) {
                return true; 
            } else if (midValue < target) {
                start = mid + 1; 
            } else {
                end = mid - 1; 
            }
        }

        return false; 
    }
}
