class Solution {
public:
int maxProduct(vector<int>& a) {
        double prefix = 1, suffix = 1, ans = INT_MIN;
        int n = a.size();
        for (int i = 0; i < n; i++) {
            prefix = (!prefix ? 1 : prefix);
            suffix = (!suffix ? 1 : suffix);
            prefix *= a[i];
            suffix *= a[n - i - 1];
            ans = max(ans, max(prefix, suffix));
        }
        return (int)ans;
    }
};