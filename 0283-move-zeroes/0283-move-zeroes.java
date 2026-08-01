class Solution {
    public void moveZeroes(int[] nums) {
        int count =0 ;
        int n = nums.length;
        for(int i = 0;i<(n-count);i++){
            if(nums[i]==0){
                count++;
                for(int j =i;j<(n-1);j++){
                    nums[j]=nums[j+1];
                }
                i--;
            }
        }
        for(int i =(n-count);i<n;i++){
                    nums[i]=0;
                }
    }
}