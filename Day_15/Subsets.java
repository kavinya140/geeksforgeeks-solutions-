//Language: Java
//Difficulty: Easy
//Platform: Leetcode
//Link: https://leetcode.com/problems/subsets/description/
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {

        sub(nums, 0, new ArrayList<>());

        return ans;
    }

    public void sub(int nums[], int index,
                           List<Integer> temp) {

        if (index == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        // Include current element
        temp.add(nums[index]);
        sub(nums, index + 1,  temp);

        // Backtrack
        temp.remove(temp.size() - 1);

        // Exclude current element
        sub(nums, index + 1, temp);
    }
}
