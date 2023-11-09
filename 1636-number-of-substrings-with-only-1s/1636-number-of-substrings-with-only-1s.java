class Solution {
    public static int mod = 1000000007;
    public int numSub(String s) {
        int left = -1;
        long ans= 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                if(left == -1){
                     ans++;
                     left = i;
                }
                   
                else
                  ans = ans+i-left+1;
                
            }else{
                left = -1;
            }
        }
        return (int)(ans%mod);
        

        
    }
}