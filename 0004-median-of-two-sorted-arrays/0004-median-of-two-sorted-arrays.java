class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        boolean flag = false;
        if((n1+n2)%2==0)
            flag = true;
        int mid = (n1+n2)/2 +1 ;
        int i=0;
        int j=0;
        int count = 0;
        int ans = 0;
        int prev = 0;
        while(i<n1&&j<n2){

            if(nums1[i]<=nums2[j]){
                ans = nums1[i];
                i++;
                count++;
            }else{
                ans = nums2[j];
                j++;
                count++;
            }
            if(count==mid)
                break;
            prev = ans;
        }
        while(i<n1){
            if(count==mid)
                break;
            prev = ans;
            ans = nums1[i++];
            count++;
        }
        while(j<n2){
            if(count == mid)
                break;
            
            prev = ans;
            ans = nums2[j++];
            count++;
        }
        System.out.println(prev+" "+ ans+" "+mid);
        if(flag){
            return (double) (prev + ans)/2;
        }
        return (double) ans;
        
    }
}