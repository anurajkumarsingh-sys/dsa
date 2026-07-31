class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int j= 0;
        if(k==0){
            return;
        }
        if(n==0||n==1){
            return;
        }
        if(k>n){
           
            k=k%n;
        }
        int [] arr = new int[n];
        for(int i = (n-k);i<n&&j<n;i++){
            arr[j++]= nums[i];
        }
        for(int i=0;i<n-k&&j<n; i++){
            arr[j++]= nums[i];
        }
        j=0;
        for(int i =0;i<n;i++){
            nums[i]= arr[j++];
        }

    }
}