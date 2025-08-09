class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            int j=n-1-i;
            sum+=mat[i][i];
            if(i!=j){
                sum+=mat[i][j];
            }
        }
        return sum;
    }
}