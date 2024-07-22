class Solution {
    public String getPermutation(int n, int k) {
        // Factorials from 0! to (n-1)!
        int[] factorial = new int[n];
        factorial[0] = 1;
        for (int i = 1; i < n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
        
        // List of numbers from 1 to n
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        
        // Convert k to zero-based index
        k--;
        
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            int index = k / factorial[i];
            sb.append(numbers.get(index));
            numbers.remove(index);
            k -= index * factorial[i];
        }
        
        return sb.toString();
    }
}