

public class main {
    public static void main(String[] args) {
        
        int [][] mat = {{1,2,3},
        {4,5,6}};
        
        int [][] mat2 = {{6,7,8},
        {2,3,4}};
        
        
        int [][] result = {{0,0,0},
        {0,0,0}};
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.format("i=%d and j=%d\n",i,j);
                
                result [i][j] = mat[i][j] + mat2[i][j];
            }
            
        }
    }
}

