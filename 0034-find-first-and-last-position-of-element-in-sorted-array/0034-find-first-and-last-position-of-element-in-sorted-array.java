class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []arr = new int [2];
        arr[0]= search(nums,target,true);
        arr[1]=search(nums,target,false);
        return arr;
        
    }
    public  static int search(int [] arr,int target,boolean flag){
       int index = -1;
        int l=0;
        int h = arr.length-1;
        int m=0;
        while(l<=h){
            m = (l+h)/2;
            if(arr[m]<target)
                l=m+1;
            else if (arr[m]>target)
                h=m-1;
            else{
                index = m;
                if(flag)
                    h=m-1;
                else
                    l=m+1;
            }
        }
        return index;
    } 
}