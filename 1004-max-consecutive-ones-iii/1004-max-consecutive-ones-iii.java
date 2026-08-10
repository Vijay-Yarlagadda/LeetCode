class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans=0;
        int left=0;
        int temp=k;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0)
                temp--;
            while(temp<0){
                if(nums[left]==0)
                    temp++;
                left++;
            }
            ans=Math.max(ans,(right-left+1));
        }
        return ans;
    }
}