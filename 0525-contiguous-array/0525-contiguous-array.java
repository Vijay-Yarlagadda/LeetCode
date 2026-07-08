class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int count=0,sum=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0)
                sum-=1;
            else
                sum+=nums[i];
            if(map.containsKey(sum)){
                count=Math.max(count,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return count;
    }
}