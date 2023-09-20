class Solution {
    public int singleNonDuplicate(int[] nums) 
    {
        int n = nums.length;
        int start =0, end = n-1;
        while(start<end)
        {
            int mid= start+(end-start)/2;
            if(nums[mid]!=nums[mid+1])
            {
                int length = end-mid;
                if(length%2==0)
                {
                    end=mid;
                }
                else
                {
                    start= mid+1;
                }
            }
                else
                {
                    int length=end-(mid-1);
                    if(length%2==0)
                    {
                        end = mid-1;
                    }
                    else
                    {
                        start= mid;
                    }
                }
                mid= start+(end-start)/2;
            }
            return nums[start];
        }
        
    }
