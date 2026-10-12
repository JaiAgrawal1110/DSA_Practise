
class Solution {
    public long maxProduct(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int bits = 32 - Integer.numberOfLeadingZeros(max);
        int size = 1 << bits;
        int[] dp = new int[size];

        for (int num : nums) {
            dp[num] = Math.max(dp[num], num);
        }

        // dp[mask] = maximum number that is a submask of mask
        for (int bit = 0; bit < bits; bit++) {
            for (int mask = 0; mask < size; mask++) {
                if ((mask & (1 << bit)) != 0) {
                    dp[mask] = Math.max(
                        dp[mask],
                        dp[mask ^ (1 << bit)]
                    );
                }
            }
        }

        long ans = 0;
        int fullMask = size - 1;

        for (int num : nums) {
            int complement = fullMask ^ num;
            long product = (long) num * dp[complement];
            ans = Math.max(ans, product);
        }

        return ans;
    }
}
