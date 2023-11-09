class Solution {
    public static int mod = 1000000007;
    public int countHomogenous(String s) {

        int left = 0;
        int right = 0;
        long ans = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(left)==s.charAt(i)){
                ans = ans + i-left+1;
            }else{
                ans++;
                left = i;
            }
        }
        return (int) (ans%mod);
        
    }
}