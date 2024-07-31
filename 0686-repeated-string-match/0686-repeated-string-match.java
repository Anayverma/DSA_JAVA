class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        
        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }
        
        if (rabinKarp(sb.toString(), b)) return count;
        
        sb.append(a);
        count++;
        
        if (rabinKarp(sb.toString(), b)) return count;
        
        return -1;
    }
    
    private boolean rabinKarp(String text, String pattern) {
        int d = 256; // number of characters in the input alphabet
        int q = 101; // a prime number
        int m = pattern.length();
        int n = text.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for text
        int h = 1;
        
        // The value of h would be "pow(d, m-1)%q"
        for (i = 0; i < m - 1; i++)
            h = (h * d) % q;
        
        // Calculate the hash value of pattern and first window of text
        for (i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + text.charAt(i)) % q;
        }
        
        // Slide the pattern over text one by one
        for (i = 0; i <= n - m; i++) {
            // Check the hash values of current window of text and pattern
            // If the hash values match then only check for characters one by one
            if (p == t) {
                for (j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j))
                        break;
                }
                
                if (j == m)
                    return true;
            }
            
            // Calculate hash value for next window of text: Remove leading digit,
            // add trailing digit
            if (i < n - m) {
                t = (d * (t - text.charAt(i) * h) + text.charAt(i + m)) % q;
                
                // We might get negative value of t, converting it to positive
                if (t < 0)
                    t = (t + q);
            }
        }
        return false;
    }
}