class Solution {
    public static ArrayList<Integer> getSmaller(int arr[], int target) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int num:arr){
            if(num<target){
                res.add(num);
            }
        }
        return new ArrayList<>(res);
        
    }
}