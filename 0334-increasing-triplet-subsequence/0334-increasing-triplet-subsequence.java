class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first_smallest=Integer.MAX_VALUE;
        int second_smallest=Integer.MAX_VALUE;

        for(int num : nums){
            if(num<=first_smallest)
                first_smallest=num;
            else if(num<=second_smallest)
                second_smallest=num;
            else
                return true;
        }
        return false;
    }
}