class Solution {
    public static int maxProduct(int[] arr) {
        int n = arr.length; // Size of the array

        int pre = 1, suff = 1;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            // If pre or suff becomes zero, reset them to 1
            if (pre == 0) pre = 1;
            if (suff == 0) suff = 1;

            // Calculate prefix product
            pre *= arr[i];

            // Calculate suffix product
            suff *= arr[n - i - 1];

            // Update the answer with the maximum of the prefix or suffix product
            ans = Math.max(ans, Math.max(pre, suff));
        }

        return ans;
    }
}