//problem: Validate an IP Address
//language: Java
//platform: geeks for geeks
//Difficulty: Medium
//Link: https://www.geeksforgeeks.org/problems/validate-an-ip-address-1587115621/1?page=1&category=Strings,Java&sortBy=submissions

class Solution {
    public boolean isValid(String s) {
        // code here
        int n = s.length();
        
        if(n < 7 || n > 15){
            return false;
        }
        
        String[] str = s.split("\\.");
        
        if(str.length != 4){
            return false;
        }
        
        for(String s1 : str){
            
            if(s1.isEmpty() || s1.length() > 3){
                return false;
            }
        
            if(s1.charAt(0) == '0' && s1.length() > 1){
                return false;
            }
            
            for(char ch : s1.toCharArray()){
                if(!Character.isDigit(ch)){
                    return false;
                }
            }
            
            int num = Integer.parseInt(s1);
            
            if(num < 0 || num > 255){
                return false;
            }
        }
        
        return true;
    }
}

