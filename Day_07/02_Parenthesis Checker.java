//problem: Paranthesis Checker
//platform: Geeks for geeks
//Language: Java
//Difficulty: Easy
//Link: https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1?page=1&category=Arrays,Strings,Java&sortBy=submissions

class Solution {
    public boolean isBalanced(String s) {
        // code here
           if (s.length() <= 1) return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if (
                    (ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')
                ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
