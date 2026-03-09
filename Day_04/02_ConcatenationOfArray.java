// Problem: Concatenation Of Array
// Platform: NeetCode
//Language: Java
// Difficulty: Easy
// Link: https://neetcode.io/problems/concatenation-of-array/question

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i];
            res[i+nums.length]=nums[i];
        }
        return res;
    }
}
