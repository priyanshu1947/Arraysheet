class rotatearray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[k];

        // Copy the last 'k' elements to the temp array
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // Shift the remaining elements to the right
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        // Copy the elements from the temp array back to the beginning
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
