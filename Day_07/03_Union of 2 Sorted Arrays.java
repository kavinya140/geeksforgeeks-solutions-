//problem: Union of 2 Sorted Arrays
//platform: Geeks for geeks
//Language: Java
//Difficulty: Medium
//Link: https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?page=2&category=Arrays,Strings,Java&sortBy=submissions

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        TreeSet <Integer> set =  new TreeSet <>();
        for(int num : a) set.add(num);
        for(int num : b) set.add(num);
        return new ArrayList<>(set); 
    }
}
    
