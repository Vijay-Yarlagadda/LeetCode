class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count=0;
        int[] remainder=new int[k];
        remainder[0]=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=(sum%k + k) % k;
            count+=remainder[rem];
            remainder[rem]++;
        }
        return count;
    }
}