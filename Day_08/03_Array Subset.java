//problrm: Array Subset
//language: Java
//Platform: geeks for geeks
//Difficulty: Basic
//link: https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1?page=2&category=Arrays,Java&sortBy=submissions


class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
            Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0; 

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                i++;
                j++;       
            } else if (a[i] < b[j]) {
                i++;       
            } else {
                return false; 
            }
        }

        return j == b.length; 
    }
}
