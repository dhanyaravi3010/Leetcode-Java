/*
167. Two Sum II - Input Array Is Sorted
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, 
find two numbers such that they add up to a specific target number.
 */
/*
 * Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
 */

 class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left<right){
            int currentSum = numbers[left] + numbers[right];
            if(currentSum == target){
                return new int[] { left + 1 , right + 1 };
            }else if(currentSum > target){
                right -= 1;
            }else if(currentSum < target){
                left += 1;
            }
        }
        return null;
    }
}