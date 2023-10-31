class Solution {
    public int[] findArray(int[] pref) {
        int []arr = new int [pref.length];
        if(pref.length==0)
            return arr;
        arr[0]=pref[0];
        int xor = arr[0];
        for(int i=1;i<pref.length;i++){
            arr[i]=pref[i]^pref[i-1];
            
        }
        // System.out.println(3|1);
        return arr;
        
    }
}