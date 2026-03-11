// Problem: Length Of Last Word
// Platform: NeetCode
//Language: Java
// Difficulty: Easy
// Link: https: https://neetcode.io/problems/length-of-last-word/question

/*class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        s = s.trim();   // remove trailing spaces
        
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                count++;
            }
            else{
                break;  // stop when space appears
            }
        }
        return count;
    }
}
*/
class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
