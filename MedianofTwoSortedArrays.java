//4
//Hard

//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

//The overall run time complexity should be O(log (m+n)).

//Example 1:

//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000


// my own solution using java:

// get the two lists merged, sort them, and then take care of both cases where even and odd length

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        for (int n: nums1) {
            one.add(n);
        }
        for (int n: nums2) {
            two.add(n);
        }
        one.addAll(two);
        Collections.sort(one);
        System.out.println(one);
        if (one.size() % 2 != 0) {
            int mid = (one.size() / 2);
            return one.get(mid);
        }
        else {
            int mid = (one.size() / 2);
            int low = (one.size() / 2 - 1);
            System.out.println(one.get(low));
            System.out.println(one.get(mid));
            int res = one.get(low) + one.get(mid);
            System.out.println(res);
            return (double) res / 2;
     
        }
        
    }
}
