//3941
//Medium

//You are given a string password.

//The strength of the password is calculated based on the following rules:

//1 point for each distinct lowercase letter ('a' to 'z').
//2 points for each distinct uppercase letter ('A' to 'Z').
//3 points for each distinct digit ('0' to '9').
//5 points for each distinct special character from the set "!@#$".
//Each character contributes at most once, even if it appears multiple times.

//Return an integer denoting the strength of the password.

// my own solution using java:

//just do exactly what instructions say

class Solution {
    public int passwordStrength(String password) {
        int ans = 0;
        HashSet<Object> seen = new HashSet<>();
        HashSet<Character> lowerletters = new HashSet<>();
        HashSet<Character> upperletters = new HashSet<>();
        HashSet<String> numbers = new HashSet<>();
        HashSet<Character> special = new HashSet<>();
        special.add('!');
        special.add('@');
        special.add('#');
        special.add('$');
    
        for (char c = 'a'; c <= 'z'; c++) {
            lowerletters.add(c);
            upperletters.add(Character.toUpperCase(c));
            
        }
        for (int i = 0; i < 10; i++) {
            numbers.add(String.valueOf(i));
            
        }
        for (Object p: password.toCharArray()) {
            //System.out.println(p);
            if (seen.contains(p)) {
                continue;
            }
            if (lowerletters.contains(p)) {
                ans += 1;
                seen.add(p);
            }
            else if (upperletters.contains(p)) {
                ans += 2;
                seen.add(p);
            }
            
            else if (numbers.contains(String.valueOf(p))) {
                ans += 3;
                seen.add(p);
            }
            else if (special.contains(p)) {
                ans += 5;
                seen.add(p);
            }
            System.out.println(ans);
        }
        return ans;
    }
}
