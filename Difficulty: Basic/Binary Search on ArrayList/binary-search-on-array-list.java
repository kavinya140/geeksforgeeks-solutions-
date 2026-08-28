class Solution {
    public static int binarySearchAL(ArrayList<Integer> list, int k) {
        // Your code here
        int left=0;
        int right=list.size()-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int val=list.get(mid);
             if(val==k){
                return list.indexOf(val);
            }
            else if(val<k){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
         return -1;
        
        

        // If k in arr return 1, else return -1
    }
}