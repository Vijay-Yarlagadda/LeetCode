class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    private int atMostK(int[] nums, int k) {
        int left = 0, totalSubarrays = 0;
        int[] freq = new int[nums.length + 1]; 
        int distinctCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (freq[nums[right]] == 0) {
                distinctCount++;
            }
            freq[nums[right]]++;
            while (distinctCount > k) {
                freq[nums[left]]--;
                if (freq[nums[left]] == 0) {
                    distinctCount--;
                }
                left++;
            }
            totalSubarrays += (right - left + 1);
        }

        return totalSubarrays;
    }
}