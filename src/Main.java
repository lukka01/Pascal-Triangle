import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[][] result = new int[num][];
        for (int i = 0; i < num; i++) {
            System.out.println("n=" + i);
            for (int j = 0; j < i; j++) {
                System.out.println();
                System.out.print(result[i][j]);
            }
        }
        pascal(5);

    }

//    Pascal's triangle is built up step by
//    step starting with row 0 consisting
//    of a single 1.
//    The next row n is computed from the
//    (n - 1)th row as follows:
//
//    The number of elements in row n is n + 1.
//    The first and last elements in each row is alwas 1.
//    The ith element of row n is given
//     by the sum of the ith and
//     (i-1)th element in row (n - 1).

//    public static int[][] pascal(int n) {
//        if ( n == 1 ) {
//            return new int[][]{{1}};
//        }
//        int[][] res = new int[n][];
//        res[0] = new int[1];
//        res[0][0] = 1;
//        res[2] = new int[2];
//        res[1][0] = 1;
//        res[1][1] = 1;
//
//        for (int i = 2; i < n; i++) {
//            res[i] = new int[i+1];
//            for (int j = 0; j <= i; j++) {
//                if ((j == 0) || (j == i)) {
//                    res[i][j] = 1;
//                } else {
//                    res[i][j] = res[i-1][j] + res[i-1][j-1];
//                }
//            }
//        }
//        return res;
//    }

    public static int[][] pascal(int n){
        if(n==1){
            return new int[][]{{1}};
        } else {
            int[][] matrix = new int[n][];
            matrix[0] = new int[1];
            matrix[0][0] = 1;
            matrix[1] = new int[2];
            matrix[1][0] = 1;
            matrix[1][1] = 1;

            for (int i = 2; i < n; i++) {
                matrix[i] = new int[i+1];
                for(int j = 0; j <= i; j++) {
                    if ((j == 0) || (j == i)) {
                        matrix[i][j] = 1;
                    } else {
                        matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
                    }
                }
            }
            return matrix;
        }
    }



}
