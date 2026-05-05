class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> remain = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if (remain.containsKey(complement)) {
                return new int [] {remain.get(complement), i};
            }
            remain.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
