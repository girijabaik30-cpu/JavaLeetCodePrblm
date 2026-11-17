import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            int rowMin = matrix[i][0];
            int minColIdx = 0;

            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    minColIdx = j;
                }
            }

            boolean isColMax = true;
            for (int r = 0; r < rows; r++) {
                if (matrix[r][minColIdx] > rowMin) {
                    isColMax = false;
                    break;
                }
            }

            if (isColMax) {
                result.add(rowMin);
            }
        }

        return result;
    }
}
