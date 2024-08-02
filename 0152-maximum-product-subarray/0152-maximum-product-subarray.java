class Solution {
     public int maxProduct(int[] a) {
        double prefix = 1, suffix = 1, ans = Integer.MIN_VALUE;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            prefix = (prefix == 0 ? 1 : prefix);
            suffix = (suffix == 0 ? 1 : suffix);
            prefix *= a[i];
            suffix *= a[n - i - 1];
            ans = Math.max(ans, Math.max(prefix, suffix));
        }
        return (int) ans;
    }
}