// Problem: Replace Elements With Greatest Element On Right Side
// Platform: NeetCode
//Language: Java
// Difficulty: Easy
// Link: https://neetcode.io/problems/replace-elements-with-greatest-element-on-right-side/question

class Solution {
    public int[] replaceElements(int[] arr) {
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int ele=-1;
            for(int j=i+1;j<arr.length;j++){
                ele=Math.max(ele,arr[j]);
            }
            ans[i]=ele;

        }
        return ans;
    }
}
