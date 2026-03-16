//problem: Anagram
//language: Java
//platform: geeks for geeks
//Difficulty: Easy
//Link: https://www.geeksforgeeks.org/problems/anagram-1587115620/1?page=1&category=Strings,Java&sortBy=submissions

class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        HashMap<Character,Integer> str1 = new HashMap<>();
        HashMap<Character,Integer> str2 = new HashMap<>();
        
        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            str1.put(ch,str1.getOrDefault(ch,0)+1);
        }
        
        for(int i=0; i<s2.length(); i++){
            char ch = s2.charAt(i);
            str2.put(ch,str2.getOrDefault(ch,0)+1);
        }
        
        if(str1.equals(str2)) {
            return true;
        }
        return false;
    }
}
