//problem: Minimize the Heights II
//language: Java
//platform: geeks for geeks
//Difficulty: Medium
// Link: https://www.geeksforgeeks.org/problems/minimize-the-heights3351/1?page=1&category=Arrays,Java&sortBy=submissions

class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
    Arrays.sort(arr);

    int ans = arr[n - 1] - arr[0];
    int smallest = arr[0] + k;
    int largest = arr[n - 1] - k;

    for (int i = 0; i < n - 1; i++) {
        int minVal = Math.min(smallest, arr[i + 1] - k);
        int maxVal = Math.max(largest, arr[i] + k);

        if (minVal < 0) continue;

        ans = Math.min(ans, maxVal - minVal);
    }
    return ans;
    }
}
