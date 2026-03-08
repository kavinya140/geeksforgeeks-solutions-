// Problem: Missing And Repeating
// Platform: GeeksforGeeks
// Language: Java
// Difficulty: Easy
// Link: https: https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1?page=1&category=Arrays,Java&sortBy=submissions

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        int [] freq = new int [n+1];
        
        int repeating = 0, missing = 0;
        
        for(int i = 0; i < n; i++){
            freq[arr[i]]++;
        
        }
        
        for(int i = 1; i <= n; i++){
            if(freq[i] == 2)
              repeating = i;
              else if (freq[i] == 0)
              missing = i;
              
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(repeating);
        list.add(missing);
        
        
        return list;
    }
}
