import java.util.Arrays;

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int farCount = 0;

        for (int x : arr1) {
            long low = (long) x - d;
            long high = (long) x + d;
            if (!hasElementInRange(arr2, low, high)) {
                farCount++;
            }
        }

        return farCount;
    }

    private boolean hasElementInRange(int[] sortedArr, long low, long high) {
        int left = 0;
        int right = sortedArr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (sortedArr[mid] < low) {
                left = mid + 1;
            } else if (sortedArr[mid] > high) {
                right = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
