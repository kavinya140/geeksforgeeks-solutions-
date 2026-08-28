class Solution {
    static String findDay(int Day, int Month, int Year) {
        // Code Here
        int[] t={0,3,2,5,0,3,5,1,4,6,2,4};
        if(Month<3){
            Year-=1;
        }
        int ind = (Year + Year / 4 - Year / 100 + Year / 400 + t[Month - 1] + Day) % 7;
    String[] days={"SUNDAY","MONDAY", "TUESDAY","WEDNESDAY","THURSDAY","FRIDAY", "SATURDAY"};
     return days[ind];
    }
    
}