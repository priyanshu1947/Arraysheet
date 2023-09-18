class Solution {
    public int singleNumber(int[] nums) {
        int Xor=0; // All the elememts is appearing twice so when it will be Xor with each other it will cancel out and become zero . so the left element will be appearing once and tha t wil be my answer
        for(int i=0; i<nums.length; i++) {
            Xor = Xor^nums[i];
        }
        return Xor;
    }
}