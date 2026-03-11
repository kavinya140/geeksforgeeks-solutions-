// Problem: Max Consecutive Ones
// Platform: NeetCode
//Language: Java
// Difficulty: Easy
// Link: https: https://neetcode.io/problems/max-consecutive-ones/question

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int high = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                high++;
                if(high > max){
                    max = high;
                }
            }
            else{
                high = 0;
            }
        }

        return max;
    }
}
