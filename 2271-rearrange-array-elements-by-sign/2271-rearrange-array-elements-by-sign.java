class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int result[] = new int[nums.length];
        int PosIndex= 0;
        int NegIndex=1;
        for (int i = 0; i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                
                result[NegIndex]=nums[i];
                NegIndex=NegIndex+2;
        }
        else{
            result[PosIndex]=nums[i];
            PosIndex+= 2;
        }

        }
        return result;
    }
}