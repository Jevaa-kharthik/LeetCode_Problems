public class Set_Matrix_Zero {
    public void setZeroes(int[][] matrix) {
        Boolean[] row = new Boolean[matrix.length];
        Boolean[] col = new Boolean[matrix[0].length];

        for(int i=0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i=0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
    
}
