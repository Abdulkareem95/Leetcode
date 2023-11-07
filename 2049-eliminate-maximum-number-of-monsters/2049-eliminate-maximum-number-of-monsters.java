class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        double [] arr = new double [dist.length];
        for(int i=0;i<dist.length;i++){
            arr[i]= (double) dist[i]/speed[i];

        }
        int ans = 0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=i)
                break;
            else
                ans++;
        }
        return ans;
        
    }
}