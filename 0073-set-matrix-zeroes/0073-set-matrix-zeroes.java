class Solution {
    public void setZeroes(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        // Create two boolean arrays to mark which rows and columns need to be zeroed
        boolean[] zeroRows = new boolean[n];
        boolean[] zeroCols = new boolean[m];

        // Iterate through the matrix to find zeros and mark rows and columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // Zero out rows
        for (int i = 0; i < n; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        // Zero out columns
        for (int j = 0; j < m; j++) {
            if (zeroCols[j]) {
                for (int i = 0; i < n; i++) {
                    arr[i][j] = 0;
                }
            }
        }
    }
}
