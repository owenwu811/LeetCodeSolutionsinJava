
//2011
//easy

//There is a programming language with only four operations and one variable X:

//++X and X++ increments the value of the variable X by 1.
//--X and X-- decrements the value of the variable X by 1.
//Initially, the value of X is 0.

//Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.

 

//Example 1:

//Input: operations = ["--X","X++","X++"]
//Output: 1
//Explanation: The operations are performed as follows:
//Initially, X = 0.
//--X: X is decremented by 1, X =  0 - 1 = -1.
//X++: X is incremented by 1, X = -1 + 1 =  0.
//X++: X is incremented by 1, X =  0 + 1 =  1.

// my own solution using java:

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;

        for (int i = 0; i < operations.length; i++) 
        {
            System.out.println(operations[i]);
            if (operations[i].equals( "--X")) {
                res--;
            }
            else if (operations[i].equals("X--")) {
                res--;
            }
            else if (operations[i].equals("X++")) {
                res++;
            }
            else if (operations[i].equals("++X")) {
                res++;
            }
            
        }
        return res;
    }
}
