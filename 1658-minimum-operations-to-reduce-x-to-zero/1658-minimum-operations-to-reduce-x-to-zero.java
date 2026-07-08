class Solution {
    public int minOperations(int[] nums, int x) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int target=sum-x;
        if(target<0) return -1;
        if(target==0) return nums.length;
        int curr_sum=0;
        int left=0,max=-1;
        for(int i=0;i<nums.length;i++){
            curr_sum+=nums[i];
            while(curr_sum>target && left<=i){
                curr_sum-=nums[left];
                left++;
            }
            if(curr_sum==target){
                max=Math.max(max,i-left+1);
            }
        }
        if(max==-1) return -1;
        return nums.length-max;
    }
}