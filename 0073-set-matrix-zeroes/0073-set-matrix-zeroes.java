class Solution {
    public void setZeroes(int[][] mat) {

        // It's not a optimal solution in optoimal we use a column 1 has a marker
        int m = mat.length;
        int n = mat[0].length;

        boolean [] row = new boolean[m];
        boolean [] cols = new boolean[n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 0){
                    row[i] = true; 
                    cols [j] = true;
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(row[i] || cols[j]){
                    mat[i][j] = 0;
                }
            }
        }
    }
}