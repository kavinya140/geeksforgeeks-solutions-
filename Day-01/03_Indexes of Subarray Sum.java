// Problem: Indexes of Subarray Sum
// Platform: GeeksforGeeks
// Language: Java
// Difficulty:Easy
// Link: https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&category=Arrays,Java&sortBy=submissions

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result =new ArrayList<>();
        int left=0;
        int sum=0;
        
        for(int right =0;right<arr.length;right++){
            sum+=arr[right];
            
            
            while(sum>target && left<=right){
                sum-=arr[left];
                left++;
            }
            
            if(sum==target){
                result.add(left+1);
                result.add(right+1);
                return result;
            }
        }
        result.add(-1);
        return result;
    }
}
