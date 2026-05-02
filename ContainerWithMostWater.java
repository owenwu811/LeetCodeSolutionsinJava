//11
//Medium

//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

//Find two lines that together with the x-axis form a container, such that the container contains the most water.

//Return the maximum amount of water a container can store.

//Notice that you may not slant the container.

// my own solution using java:

// shrink whichever side is less inward because we are trying to maximize meaning reduce the minimums chances

class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            res = Math.max(res, (r - l) * Math.min(height[l], height[r]));

            if (height[l] < height[r]) {
                l++;
            }
            else {
                r--;
            }
        }
        return res;
        
    }
}
