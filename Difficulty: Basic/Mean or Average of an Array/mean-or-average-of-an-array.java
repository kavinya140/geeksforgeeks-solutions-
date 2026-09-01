class Solution {
    public static int findMean(int[] arr) {
        // code here
       int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double ans=Math.abs(sum/arr.length);
        return (int)ans;
    }
};