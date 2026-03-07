// Problem: Array Leaders
// Platform: GeeksforGeeks
// Language: Java
// Difficulty: Easy
// Link: https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?page=1&category=Arrays,Java&sortBy=submissions

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
         int n = arr.length - 1; 
        int max = arr[n];
        list.add(max);
        for(int i=n - 1; i >=0; i--) {
            if(max < arr[i] || max == arr[i]) {
                max = arr[i];
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
