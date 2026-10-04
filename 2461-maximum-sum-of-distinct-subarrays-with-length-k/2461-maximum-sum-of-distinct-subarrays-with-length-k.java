class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        long max = 0;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            if (right >= k) {
                int left = nums[right - k];

                sum -= left;

                map.put(left, map.get(left) - 1);

                if (map.get(left) == 0) {
                    map.remove(left);
                }
            }

            if (right >= k - 1 && map.size() == k) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}