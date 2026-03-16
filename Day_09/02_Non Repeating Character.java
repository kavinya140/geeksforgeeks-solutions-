//problem: Non Repeating Character
//language: Java
//platform: geeks for geeks
//Difficulty: Easy
//Link: https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1?page=1&category=Strings,Java&sortBy=submissions

class Solution {
    public char nonRepeatingChar(String s) {
        // code here
      for(int i=0;i<s.length();i++){
          if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
              return s.charAt(i);
          }
      }
      return '$';
    }
}
