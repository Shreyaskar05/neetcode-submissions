class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int i=-1;
        for(i=0;i<n;i++)
        {
            if(arr[i]==2)
            {
                break;
            }
        }
        int j=i+1;
        while(j<n)
        {
            if(arr[j]!=2)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
            else
                j++;
        }
        int k;
        for(k=0;k<i;k++)
        {
            if(arr[k]==1)
            {
                break;
            }
        }
        int l=k+1;
        while(l<i)
        {
            if(arr[l]!=1)
            {
                int temp=arr[k];
                arr[k]=arr[l];
                arr[l]=temp;
                k++;
                l++;
            }
            else
                l++;
        }
    }

}