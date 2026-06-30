class Solution {
    public boolean canJump(int[] nums) {
        int mxr=0;
        int i=0;
        while(i<nums.length)
        {
            if(i>mxr)
                return false;
            else
            {
                mxr=Math.max(i+nums[i],mxr);
                if(mxr>=nums.length)
                    return true;
            }
            i++;
        }
        return true;
    }
}
