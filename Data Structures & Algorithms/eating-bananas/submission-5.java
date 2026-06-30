class Solution {

    public int minimum_hours(int[] piles,int k)
    {   int hours=0;
        for(int pile:piles)
        {
            hours+=(int)Math.ceil((double)pile / k);
        }
        return hours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int i:piles)
        {
            max=Math.max(max,i);
        }
        int low=1,high=max;
        int minhours=max;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(minimum_hours(piles,mid)<=h)
               { 
                high=mid-1;
                minhours=mid;
               }
            else
                low=mid+1;
        }
        return minhours;


    }
}
