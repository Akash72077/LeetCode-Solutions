class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat[0].length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=mat[i][i];
        }
int j=n-1;
        for(int i=0; i<n; i++){

            sum+=mat[i][j];
            j--;
        }
        if(n%2==1){
            sum-=mat[n/2][n/2];
        }
        return sum;
    }
}