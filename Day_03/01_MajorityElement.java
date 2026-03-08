// Problem: Majority Element
// Platform: GeeksforGeeks
// Language: Java
// Difficulty: Medium
// Link: https://www.geeksforgeeks.org/problems/majority-element-1587115620/1?page=1&category=Arrays,Java&sortBy=submissions

class Solution {
    int majorityElement(int arr[]) {
      int candidate=0;
      int count=0;
      for(int num:arr){
          if(count == 0){
              candidate=num;
              count=1;
          }else if(num == candidate){
              count++;
          }else{
              count--;
          }
      }
      for(int num:arr){
          if(num == candidate){
              count++;
          }
      }
      return (count>arr.length/2)?candidate:-1;
    }
}

