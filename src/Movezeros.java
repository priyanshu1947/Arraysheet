// Move zeros leetcode 283
class movezeros {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[nonZeroIndex];
                nums[nonZeroIndex] = nums[i];
                nums[i] = temp;
                nonZeroIndex++;
            }
        }
    }
}
