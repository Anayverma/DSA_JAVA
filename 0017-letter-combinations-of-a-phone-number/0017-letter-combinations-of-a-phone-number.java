class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) {
            return res;
        }
        
        Map<Character, String> dic = new HashMap<>();
        dic.put('2', "abc");
        dic.put('3', "def");
        dic.put('4', "ghi");
        dic.put('5', "jkl");
        dic.put('6', "mno");
        dic.put('7', "pqrs");
        dic.put('8', "tuv");
        dic.put('9', "wxyz");
        
        dfs(digits, 0, dic, "", res);
        return res;
    }
    
    private void dfs(String nums, int index, Map<Character, String> dic, String path, List<String> res) {
        if (index >= nums.length()) {
            res.add(path);
            return;
        }
        
        String string1 = dic.get(nums.charAt(index));
        for (int i = 0; i < string1.length(); i++) {
            dfs(nums, index + 1, dic, path + string1.charAt(i), res);
        }
    }
}