// Problem: Second Largest 
// Platform: GeeksforGeeks
//Language: Java
// Difficulty: Easy
// Link: https://www.geeksforgeeks.org/problems/second-largest3735/1?page=1&category=Arrays,Java&sortBy=submissions

class Solution {
    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length-1;
        for(int i=n;i>0;i--){
            if(arr[i-1]<arr[i]){
                return arr[i-1];
            }
        }
        return -1;
    }
}
