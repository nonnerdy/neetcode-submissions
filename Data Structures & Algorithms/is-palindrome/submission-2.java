class Solution {
    public boolean isPalindrome(String s1) {
        int left = 0, right = s1.length() - 1;
        while (left < right) {
            char a = s1.charAt(left);
            char b = s1.charAt(right);

            //convert upper case to lower case
            if (a >= 'A' && a <= 'Z') a = (char) (a + 32);
            if (b >= 'A' && b <= 'Z') b = (char) (b + 32);

            // Skip non-alphanumeric
            if (!((a >= 'a' && a <= 'z') || (a >= '0' && a <= '9'))) {
                left++;
                continue;
            }
            if (!((b >= 'a' && b <= 'z') || (b >= '0' && b <= '9'))) {
                right--;
                continue;
            }

            // Compare
            if (a != b) return false;

            left++;
            right--;
        }
        return true;
    }
}
