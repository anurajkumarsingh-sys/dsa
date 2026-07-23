class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int count = 0 ;
        if(f.length ==1 && n==1){
            if(f[0] == 0){
                return true;
            }
            else{
                return false;
            }
        }
        if(f.length ==1 && n==0){
            return true;
        }
        if(f[0] == 0 && f[1] == 0){
            count++;
            f[0] = 1;
        }
        if(f[f.length-1] == 0 && f[f.length-2]==0){
            count++;
            f[f.length-1]=1;
        }
        for(int i =1; i<f.length-1; i++){
            if(f[i] == 0 &&f[i-1] == 0 && f[i+1] == 0){
                count++;
                f[i] =1;
            }
        }
        if(count>=n){
            return true;
        }else{
            return false;
        }
        
      
    }
}