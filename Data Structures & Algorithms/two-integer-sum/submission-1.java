class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0 , right = 1, length = nums.length;
        int[] result = new int[2];

        for (left = 0; left < length; left++) {
            for (right = left + 1; right < length; right++) {
                int sum = nums[left] + nums[right];
                if(sum == target){
                    result[0] = left;
                    result[1] = right;
                    return result;
                }
            }
        }
        return result;
    }
}
