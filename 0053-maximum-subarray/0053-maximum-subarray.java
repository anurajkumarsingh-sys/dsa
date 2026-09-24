class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=0;
        int sum =0;
        boolean sign =false;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            if(sum>0){
                sign =true;
            }
            maxsum= Math.max(sum,maxsum);

            if(sum<0){
                sum=0;
            }
        }
        if (sign == false){
            maxsum = nums[0];
            for(int i = 0; i< nums.length;i++){
                
                maxsum = Math.max(nums[i],maxsum);
            }
        }
    
        return maxsum;
    } 
}