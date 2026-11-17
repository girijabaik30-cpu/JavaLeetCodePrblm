class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int secCol = n - 1 - i;
            sum += mat[i][i];
            if (i != secCol) {
                sum += mat[i][secCol];
            }
        }

        return sum;
    }
}
