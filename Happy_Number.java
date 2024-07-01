public class Happy_Number {
    public boolean isHappy(int n) {
        if(n ==1 || n == 7){
            return true;
        }
        int sum = square(n);

        while(sum != 1 && sum != 4){
            sum = square(sum);
        }
        return sum == 1;
    }
    private int square(int n){
        int sum = 0;
        while(n > 0){
            int num = n % 10;
            sum += num * num;
            n /= 10;
        }
        return sum;
    }
}
