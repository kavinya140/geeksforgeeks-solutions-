class Solution {
    public String sortedDistinct(String s) {
        // code here
       int[] count = new int[256];

               for (int i = 0; i < s.length(); i++) {
                   count[s.charAt(i)]++;
               }

              
               StringBuilder ans = new StringBuilder();
               for (int i = 0; i < 256; i++) {
                   if (count[i] > 0) { 
                       ans.append((char) i);
                   }
               }

               return ans.toString();
    }
}
