// Problem: Append Characters to String to Make Subsequence
// Platform: NeetCode
//Language: Java
// Difficulty: Medium
// Link: https:https://neetcode.io/problems/append-characters-to-string-to-make-subsequence/question

class Solution {
    public int appendCharacters(String s, String t) {
        int i=0,j=0;
        while(i<s.length()&& j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return t.length()-j;
    }
}
