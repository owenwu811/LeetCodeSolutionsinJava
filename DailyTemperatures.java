//739
//Medium

//Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

//Example 1:

//Input: temperatures = [73,74,75,71,69,72,76,73]
//Output: [1,1,4,2,1,1,0,0]

// my own solution using java:

//use monotonic stack by pushing to the stack and seeing before with lesser values and take distance

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] ans = new int[temperatures.length];
        Arrays.fill(ans, 0);
        System.out.println(ans);
        for (int i = 0; i < temperatures.length; i++)  {
            while (!stack.isEmpty() && temperatures[stack.getLast()] < temperatures[i]) 
            {
                int idx = stack.removeLast();
                //System.err.println(idx);
                int diff = i - idx;
                ans[idx] = diff;

            }
            stack.add(i);
        }
        return ans;
    }
}
