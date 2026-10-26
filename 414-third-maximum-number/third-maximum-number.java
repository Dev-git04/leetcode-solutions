class Solution {
    public int thirdMax(int[] nums) {
       Arrays.sort(nums);
        int count = 0;
        long prev = Long.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != prev) {
                count++;
                prev = nums[i];
                if (count == 3) {
                return nums[i];
                }
            }
        }
        return nums[nums.length - 1];
    }
}