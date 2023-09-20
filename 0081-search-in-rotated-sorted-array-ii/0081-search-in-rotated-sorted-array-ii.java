class Solution {
    public boolean search(int[] arr, int target) 
    {
        int n = arr.length;
        int start= 0, end = n-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==target)
            {
                return true;
            }
            else if (arr[start]==arr[mid] && arr[mid] == arr[end])
            {
                start++;
                end --;
                continue;
            }
            if(arr[start]<=arr[mid])
            {
                if(arr[start]<=target && target<arr[mid])
                {
                    end= mid-1;
                }
                else
                {
                    start= mid+1;
                }
            }
            else{
                if(arr[mid]<=target && target<= arr[end])
                {
                    start= mid+1;
                }
                else
                {
                    end= end-1;
                }
            }
        }
        return false;
        
    }
}