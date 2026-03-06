// Problem: Missing in Array
// Platform: GeeksforGeeks
// Language: Java
// Difficulty: Easy
// Link: https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&category=Arrays,Java&sortBy=submissions

class Solution {
    int missingNum(int arr[]) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
            
        }
        return arr.length+1;
    }
}
