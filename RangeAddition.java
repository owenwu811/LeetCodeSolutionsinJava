//370
//Medium


//You are given an integer length and an array updates where updates[i] = [startIdxi, endIdxi, inci].

//You have an array arr of length length with all zeros, and you have some operation to apply on arr. In the ith operation, you should increment all the elements arr[startIdxi], arr[startIdxi + 1], ..., arr[endIdxi] by inci.

//Return arr after applying all the updates.


// my own solution using java:

// just use line sweep

class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] ans = new int[length];
        Arrays.fill(ans, 0);
        for (int i = 0; i < updates.length; i++) {
            int one = updates[i][0];
            int two = updates[i][1];
            int three = updates[i][2];
            ans[one] += three;
            if (two + 1 < ans.length) {
                ans[two + 1] -= three;
            }

        }
        int[] res = new int[length];
        int tot = 0;
        for (int i = 0; i < ans.length; i++) {
            tot += ans[i];
            res[i] = tot;

        }
        return res;
    }
}
