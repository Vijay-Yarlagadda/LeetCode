class Solution {
    public int longestSubarray(int[] nums) {
        int ans=0;
        int left=0;
        int temp=1;
        int count=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0)
                temp--;
            while(temp<0){
                if(nums[left]==0)
                    temp++;
                left++;
            }
            ans=Math.max(ans,right-left);
        }
        return ans;
    }
}