class Solution {
    public boolean digitCount(String num) {
        int n = num.length();
        int[] freq = new int[10];

        for (char c : num.toCharArray()) {
            freq[c - '0']++;
        }

        for (int i = 0; i < n; i++) {
            int digit = num.charAt(i) - '0';
            if (freq[i] != digit) {
                return false;
            }
        }

        return true;
    }
}