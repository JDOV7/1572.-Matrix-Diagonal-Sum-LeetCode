package leetcode;

public class MatrixDiagonalSum1572 {

    public void MatrixDiagonalSum1572() {
        int[][] mat = {{1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};
        int iSecundary = mat.length;
        int iSum = 0;
        for (int i = 0; i < mat.length; i++) {
            iSum += mat[i][i];
            iSum += mat[i][--iSecundary];
        }
        if (mat.length % 2 == 1) {
            iSum -= mat[mat.length / 2][mat.length / 2];
        }
        System.out.println(iSum);

    }
}
