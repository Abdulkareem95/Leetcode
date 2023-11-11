class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j = i;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            reverse(matrix[i]);
        }
        
    }
    public static void reverse(int [] arr){
        for(int i=0;i<arr.length/2;i++){
            int t = arr[i];
            arr[i]= arr[arr.length-1-i];
            arr[arr.length-1-i] = t;
        }
    }
}