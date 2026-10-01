class Solution {
    public int mctFromLeafValues(int[] arr) {
        int ans = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MAX_VALUE);

        for (int x : arr) {
            while (stack.peek() <= x) {
                int mid = stack.pop();

                ans += mid * Math.min(stack.peek(), x);
            }

            stack.push(x);
        }

        while (stack.size() > 2) {
            int mid = stack.pop();
            ans += mid * stack.peek();
        }

        return ans;
    }
}