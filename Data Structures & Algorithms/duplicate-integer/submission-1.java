class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> duplicateChecker = new HashMap<>();
        for (int n : nums) {
            if (duplicateChecker.containsKey(n)) {
                return true;
            }
            duplicateChecker.put(n, 1);
        }
        return false;
    }
}