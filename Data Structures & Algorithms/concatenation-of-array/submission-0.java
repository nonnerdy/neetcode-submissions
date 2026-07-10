class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int [] result = new int[length * 2];
        for(int i = 0, j = 0 ; i < result.length ; i++, j++){
            if(j == length){
                j = 0;
            }
            result[i] = nums[j];
        }
        return result;
    }
}