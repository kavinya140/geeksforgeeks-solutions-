// Problem: Two Sum
// Platform: GeeksforGeeks
//Language: Java
// Difficulty: Easy
// Link: https://www.geeksforgeeks.org/problems/key-pair5616/1

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        if(arr.length==1){
            return false;
        }
         int n=arr.length;
       
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
     
         while(i<j){
               if(arr[i]+arr[j]==target) return true;
               else if(arr[i]+arr[j]<target) i++;
               else j--;
     }
     return false;
    }
}
