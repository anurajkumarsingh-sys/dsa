class Solution {
    public void nextPermutation(int[] nums) {
        int piv = -1;
        int n= nums.length;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                piv=i-1;
                break;
            }
        }
        if(piv==-1){
            rev(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>piv;i--){
            if(nums[i]>nums[piv]){
                swap(nums,i,piv);
                break;
            }
        }
        rev(nums,piv+1,n-1);
    }   
        private void swap(int[] nums,int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        private void rev(int []nums,int start, int end){
            while(start<end){
                swap(nums,start,end);
                start++;
                end--;
            }

        }
    
}