public class Reverse_integer {
    public static int reverse(int x){
        boolean neg=false;
        if(x<0){
            x=Math.abs(x);
            neg=true;
        }
        int temp =x;long sum=0;
        while(temp>0){
            sum=(sum*10)+temp%10;if(sum>=Integer.MAX_VALUE||sum<=Integer.MIN_VALUE) return 0;
            temp/=10;
        }
        x=(int)sum;
        return (neg)? x*(-1) : x;
    }
    
}
