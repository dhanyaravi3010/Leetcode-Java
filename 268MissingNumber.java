/*
Example 1:
Input: nums = [3,0,1]
Output: 2
*/

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n* (n+1)/2;
        int arraySum = 0;

        for(int num:nums){
            arraySum += num;
        }
        return totalSum - arraySum;
    }
}