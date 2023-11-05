class Solution {
    public int getWinner(int[] arr, int k) {
        int i = 0;
        int j = i+1;
        int n = arr.length;
        int c = k;
        int max = Arrays.stream(arr).max().getAsInt();
        if(k>arr.length-1)
            return max;
        while(c>0){
            if(arr[i]>arr[j]){
                j++;
                j = j%n;
                c--;
            }else{
                i=j;
                i=i%n;
                j++;
                j=j%n;
                c=k;
                c--;
            }
        }
        return arr[i];
        
    }
}