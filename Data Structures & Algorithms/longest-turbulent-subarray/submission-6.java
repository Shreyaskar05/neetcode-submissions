class Solution {
    public int maxTurbulenceSize(int[] arr) {
        
        int i=0,j=1,flag=0;
        int currlen=1,maxlen=1;
        if(arr.length<2)
        {
            return arr.length;
        }
        while(j<arr.length)
        {
            if(arr[j]>arr[j-1])
            {
                if(flag!=-1 && flag!=0)
                {
                    i=j-1;
                    j++;
                }
                else
                {
                    currlen=j-i+1;
                    maxlen=Math.max(currlen,maxlen);
                    j++;
                }
                flag=1;
            }
            else if(arr[j]<arr[j-1])
            {
                if(flag!=1 && flag!=0)
                {
                    i=j-1;
                    j++;
                }
                else
                {
                    currlen=j-i+1;
                    maxlen=Math.max(currlen,maxlen);
                    j++;
                }
                flag=-1;                
            }
            else
            {
                i=j;
                j++;
                flag=0;
            }
        }

        return maxlen;
    }
}