class Solution {
    public int peakIndexInMountainArray(int[] arr) {
         int l=0;
        int h = arr.length-1;
        if(l==h){
            return l;
        }
        int m;
        while(l<=h){
            m = (l+h)/2;
            if(m==arr.length-1&&arr[m]>arr[m-1])
                return m;
            if(m==0&&arr[m]>arr[m+1])
                return m;
            if(arr[m]>arr[m+1]&&arr[m]>arr[m-1]){
                return m;
            }
            if(arr[m]>arr[m+1]){
                h=m-1;
            }else{
                l=m+1;
            }
            System.out.println(m);
        }
        return -1;
        
    }
}