
public class setMatrixZero_73 {

    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 1, 0},
            {1, 4, 1, 2},
            {1, 1, 1, 5}
        };

       
        // O(m*n)

        // List<int[]> l = new ArrayList<>();
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if (matrix[i][j] == 0) {
        //             l.add(new int[]{i,j});
        //             System.out.println(i+" "+ j);
        //         }
        //     }
        // }
        // for(int i = 0;i<l.size();i++){
        //     int []arr = l.get(i);
        //     for(int k = 0;k<matrix[0].length;k++){
        //         matrix[arr[0]][k] = 0;
        //     }
        //     for(int k = 0;k<matrix.length;k++){
        //         matrix[k][arr[1]] = 0;
        //     }
        // }
        // O(1)
        boolean row = false,col = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if(i == 0){
                        row = true;
                    }
                    if(j == 0){
                        col = true;
                    }
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 1; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }

        }

        for (int i = 1; i < matrix.length; i++) {
            if ((matrix[i][0] == 0)) {
                for (int j = 1; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(row){
            for(int i = 0;i<matrix[0].length;i++){
                matrix[0][i] = 0;
            }
        }
        if(col){
            for(int i = 0;i<matrix.length;i++){
                matrix[i][0] = 0;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println(row +" " + col);

    }

}
