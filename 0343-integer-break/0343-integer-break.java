class Solution {
    public int integerBreak(int n) {
        if(n==2)
            return 1;
        if(n==3)
            return 2;

    int c3 = 0;
    int f1 = 0;
    while(n-3>=0){
        c3++;
        n-=3;
        f1 =1;
    }
    int c2 = 0;
    if(f1==1&&n==1){
        c3--;
        c2= c2+2;
    }
    while(n-2>=0){
        n-=2;
        c2++;
    }
    int res = (int) Math.pow(3,c3)* (int) Math.pow(2,c2);
    return res;
        
    }
}