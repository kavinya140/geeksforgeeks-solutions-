//Platform: Leetcode(401)
//Language: Java
//Difficulty: Easy
//Link: https://leetcode.com/problems/binary-watch/
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
      ArrayList<String> li=new ArrayList<>();
        if(turnedOn>8){
            return li;
        }
        for(int h=0;h<12;++h){
            for(int m=0;m<60;++m){
                if(Integer.bitCount(h)+Integer.bitCount(m)==turnedOn){
                    li.add(String.format("%d:%02d",h,m));
                }
            }
        }
        return li;
    }
}
