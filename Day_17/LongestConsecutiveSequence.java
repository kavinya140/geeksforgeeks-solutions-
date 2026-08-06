//Language: Java
//Difficulty: Moderate
//Link: https://neetcode.io/problems/longest-consecutive-sequence/question
//Platform: Neetcode
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                if(Math.abs(nums[i]-nums[i+1])==1){
                    count++;
                }
            }
        }
        return count;
    }
}
