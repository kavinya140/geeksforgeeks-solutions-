//Platform: Neetcode
//Language: Java
//Difficulty: Medium
//Link: https://neetcode.io/problems/three-integer-sum
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res=new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(sum==0){
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
                        res.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}
