//problem: Longest Subarray with Sum K
//platform: Geeks for geeks
//Language: Java
//Difficulty: Medium
//Link: https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?page=1&category=Arrays,Strings,Java&sortBy=submissions

class Solution {
    public int longestSubarray(int[] arr, int k) {
           HashMap<Integer,Integer> map= new HashMap<>();
        int sum=0;
        int max=0;
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
            max=i+1;
            }
        if(map.containsKey(sum-k)){
        int len=i-map.get(sum-k);
        max=Math.max(max,len);
        }
        if(!map.containsKey(sum)){
        map.put(sum,i);
        }    
        }
        return max;
    }
}
