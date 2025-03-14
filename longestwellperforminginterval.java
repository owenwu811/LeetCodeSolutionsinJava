//1124
//medium

// my own solution using java:

//We are given hours, a list of the number of hours worked per day for a given employee.

//A day is considered to be a tiring day if and only if the number of hours worked is (strictly) greater than 8.

//A well-performing interval is an interval of days for which the number of tiring days is strictly larger than the number of non-tiring days.

//Return the length of the longest well-performing interval.

 

//Example 1:

//Input: hours = [9,9,6,0,6,6,9]
//Output: 3
//Explanation: The longest well-performing interval is [9,9,6].

//java takes n squared, so just use java instead of python for this question


class Solution {
    public int longestWPI(int[] hours) {
        int res = 0;
        for (int i = 0; i < hours.length; i++) {
            int tiring = 0;
            int non = 0;
            for (int j = i; j < hours.length; j++) {
                if (hours[j] > 8) {
                    tiring++;
                }
                else {
                    non++;
                }
                if (tiring > non) {
                    if (j - i + 1 >= res) {
                        res = j - i + 1;
                    }
                }

            }

        }
        return res;
    
          

    }
}
