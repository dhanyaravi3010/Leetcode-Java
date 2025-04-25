/*Can you reach the end?
nums =
[2,4,1,1,3,5]
Output
true

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
*/

public class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;    
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
        }   
        return true;
    }
}
