class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        
        // Initialize the result with n, as it's the maximum possible missing number.
        int result = n;
        
        // XOR all elements in arr and XOR with numbers from 0 to n.
        for (int i = 0; i < n; i++) {
            result =result^ i ^ arr[i];
        }
        
        return result;
    }
}
