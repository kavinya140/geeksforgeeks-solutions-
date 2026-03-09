// Problem: Contains Duplicates
// Platform: NeetCode
//Language: Java
// Difficulty: Easy
// Link: https://neetcode.io/problems/duplicate-integer/question

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
              if(nums[i]==nums[i+1]){
                return true;
              }
        }
        return false;
    }
}
