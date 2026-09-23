class Solution {
    public int minOperations(int[] nums, int x) {
       int total = 0;
       int left = 0;
       int sum = 0;
       int maxLen = 0;
       for(int i = 0; i<nums.length; i++){
        total += nums[i];
       }
        if (x > total) {
            return -1;
       } 
       if (x == total) {
        return nums.length;
        }
        int target = total - x;
        for (int right = 0; right < nums.length; right++) {
        sum += nums[right];
            while(sum > target){
                sum -= nums[left];
                left++;
            }
            if (sum == target) {
            maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        if (maxLen == 0) {
            return -1;
        }
        return nums.length - maxLen;
    }
}