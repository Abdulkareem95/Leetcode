class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        long x = Math.abs(sx-fx);
        long y = Math.abs(sy - fy);
       
       long res = Math.max(y,x);
        if(res>t||(res == 0 &&(t<2&&t>0)))
            return false;
        return true;
        
        
    }
}