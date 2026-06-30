class Solution {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;
        int low = 0, high = nums.length-1;
        int min = Integer.MAX_VALUE;

        while(low<=high)
        {
            int mid = low +(high-low)/2;
            if(nums[mid]>=nums[low])
            {
                min=Math.min(min,nums[low]);
                low=mid+1;
            }
            else
            {    
                min=Math.min(min,nums[mid]);
                high=mid-1;
            }

        }
        return min;
    }
}
