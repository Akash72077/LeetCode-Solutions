class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat= new int[m][n];
        int k=indices.length;

        for(int i=0; i<k; i++){
           
           int rows = indices[i][0];
           int cols = indices[i][1];

           for(int j=0; j<n; j++){
                mat[rows][j]++;  // rows 
           }
            for(int j=0; j<m; j++){
                 mat[j][cols]++; // cols 
           }



        }
        int count=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;

    }
}