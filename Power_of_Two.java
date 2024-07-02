public class Power_of_Two {
    public boolean isPowerOfTwo(int n) {
        // if(n == 1){
        //     return true;
        // }
        // if(n % 2 != 0){
        //     return false;
        // }
        // for(int i = 0; i < 31; i++){
        //     if(n == Math.pow(2, i)){
        //         return true;
        //     }
        // }
        // return false;
        if(n==0) return false;
        if(n%2==0) return isPowerOfTwo(n/2);
        if(n == 1) return true;
        return false;
    }
}
