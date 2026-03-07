// Problem: Second Largest Element
// Platform: GeeksforGeeks
// Language: Java
// Difficulty: Easy
// Link: https: https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&category=Arrays,Java&sortBy=submissions

class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
           Arrays.sort(arr);
         ArrayList<Integer> a=new ArrayList<>();
         int n=arr.length;
         for(int i=0;i<n-1;i++){
             if(arr[i]==arr[i+1]){
                 a.add(arr[i]);
             }
         }
        return a;
    }
}
