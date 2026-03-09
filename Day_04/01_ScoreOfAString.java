// Problem: Score of a String
// Platform: NeetCode
//Language: Java
// Difficulty: Easy
// Link: https://neetcode.io/problems/score-of-a-string/question

class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int diff= Math.abs(s.charAt(i+1)-s.charAt(i));
            sum+=diff;
        }
        return sum;
    }
}
