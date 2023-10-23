class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        if(nums.length==0)
            return 0;
        for(int i=0;i<nums.length;i++)
            set.add(nums[i]);
        int ans = Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
         
            if(!set.contains(num-1)){
                c=0;
                while(set.contains(num++))
                    {
                        c++;
                    }
            }
            ans = Math.max(ans,c);

        }
        return ans;
        
    }
}