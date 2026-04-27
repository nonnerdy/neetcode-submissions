class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> duplicateChecker = new HashSet<Integer>();
        for (int n : nums) {
            if (!duplicateChecker.add(n)) {
                return true;
            } else {
                duplicateChecker.add(n);
            }
        }
        return false;
    }
}