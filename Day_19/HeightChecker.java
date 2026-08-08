//Language: Java
//Difficulty: Easy
//Platform: Neetcode
//Link: https://neetcode.io/problems/height-checker/history?submissionIndex=0
class Solution {
    public int heightChecker(int[] heights) {
        int expected[]=Arrays.copyOf(heights,heights.length);
        Arrays.sort(expected);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }
        return count;
    }
}
