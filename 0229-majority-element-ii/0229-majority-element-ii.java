class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        List<Integer> l = new ArrayList<>();
        int n = nums.length;
        for(Map.Entry<Integer,Integer> x: m.entrySet()){
            int val = x.getValue();
            if(val>n/3)
                l.add(x.getKey());
        }
        return l;
        
    }
}