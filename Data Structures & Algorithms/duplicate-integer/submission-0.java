class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> frequency = new HashSet<>();
        for (int num : nums) {
            if (frequency.contains(num)) {
                return true;
            }
            frequency.add(num);
        }
        return false;
    }
}