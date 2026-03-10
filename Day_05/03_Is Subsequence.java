// Problem: Is Subsequence
// Platform: NeetCode
//Language: Java
// Difficulty: Easy
// Link: https://neetcode.io/problems/is-subsequence/question

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}
