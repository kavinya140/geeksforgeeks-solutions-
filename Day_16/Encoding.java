//Platform: Neetcode
//Language: Java
//Difficulty: Medium
//Link: https://neetcode.io/problems/string-encode-and-decode/question
class Solution {
    public String encode(List<String> strs) {
              if (strs.isEmpty()) return "";
        StringBuilder res = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        for (String str : strs) {
            sizes.add(str.length());
        }
        for (int size : sizes) {
            res.append(size).append(',');
        }
        res.append('#');
        for (String str : strs) {
            res.append(str);
        }
        return res.toString();
    }
}
