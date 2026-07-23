class Solution {
    public int numberOfChild(int n, int k) {
        int rounds = k / (n - 1);
        int rem = k % (n - 1);

        if (rounds % 2 == 0) {
            return rem;
        }

        return n - 1 - rem;
    }
}