//Problem: Valid Elements in an Array
//Difficulty: Easy
//link: https://leetcode.com/problems/valid-elements-in-an-array/submissions/2089071694/
//Platform: Leetcode

class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            boolean left=true;
            boolean right=true;

            for(int j=0;j<i;j++){
                if(nums[j]>=nums[i]){
                    left=false;
                    break;
                }
            }
             for(int j=i+1;j<nums.length;j++){
                if(nums[j]>=nums[i]){
                    right=false;
                    break;
                }
            }
            if(left || right){
                li.add(nums[i]);
            }
        }
        return li;
    }
}
