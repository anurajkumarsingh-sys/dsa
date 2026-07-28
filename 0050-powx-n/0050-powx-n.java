class Solution {
    public double myPow(double x, int n) {
        long power=n;
        if(power==0){
            return 1;
        }
        if(power==1){
            return x;
        }
        if(n<0){
            x= 1/x;
            power= -power;
        }
         double pow = myPow(x,(int)(power/2));
        if (power % 2 == 0) {
            return pow * pow;
        }
        
            return x* pow * pow;

    }
}