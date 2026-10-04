class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length/2;
        int pos[]= new int[n];
        int neg[] = new int[n];
        int j=0;
        int k=0;
        int l =0;
        for(int i= 0;i<nums.length;i++){
            if(nums[i]>0){
                 pos[j++]= nums[i];
            }
            else{
                neg[k++]= nums[i];
            }
        }
            j=0;
            k=0;   
           for(int i=0;i<nums.length;i++){
                 if(i%2==0){
                    nums[i]=pos[j++];
                 }
                 else{
                    nums[i]=neg[k++];
                 }
           }
            return nums;
    }
}