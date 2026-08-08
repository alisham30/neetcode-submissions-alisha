class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        char[] arr = s.toCharArray();

        int n = arr.length;
        int i = 0;

        while (i < n / 2) {
            if (arr[i] != arr[n - i - 1]) {
                return false;
            }
            i++;
        }

        return true;
    }
}