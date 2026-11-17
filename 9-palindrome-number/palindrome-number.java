
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reversed = 0;

        for (int temp = x; temp != 0; temp /= 10) {
            int digit = temp % 10;
            reversed = (reversed * 10) + digit;
        }

        return x == reversed;
    }
}