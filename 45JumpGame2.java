/* What's the minimum number of jumps to reach the end?
Example 1:

Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [2,3,0,1,4]
Output: 2
*/



public class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int end = 0;
        int maxReach = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);
            if (i == end) {
                jumps++;
                end = maxReach;
            }
        }

        return jumps;
    }
}
