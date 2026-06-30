class Solution {
    public int jump(int[] nums) {
        int mxr = 0, count = 0, curr = 0;
        for (int i = 0; i < nums.length-1; i++) {
            mxr = Math.max(mxr, i + nums[i]);
            if (i == curr) {
                count++;
                curr = mxr;
            }
        }
        return count;
    }
}