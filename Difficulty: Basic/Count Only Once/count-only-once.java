class Solution {
    public static int countOnce(int arr[]) {
        // Your code here
        HashSet<Integer> set=new HashSet<>();
        for(int ar:arr){
            set.add(ar);
        }
        return set.size();
    }
}
