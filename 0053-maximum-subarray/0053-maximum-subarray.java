class Solution {
    public int maxSubArray(int[] nums) 
    {
        int sum =0;
        int maxi = Integer.MIN_VALUE;
        for ( int i=0; i<nums.length;i++)
        {
            sum= sum+nums[i];
            maxi= Math.max(sum,maxi);
            if(sum>maxi)
            {
                maxi=sum;
            }
            else if (sum<0)
            {
                sum=0;
            }
        }
        return maxi;
        
    }
}