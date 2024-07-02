public class Max_Value_of_equation {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int max = Integer.MIN_VALUE;
        int right_pointer = 1;

        for(int i = 0; i < points.length;i++){
            if(right_pointer < i + 1){
                right_pointer = i + 1;
            }
            for(int j = right_pointer; j < points.length; j++){
                int xdiff = points[j][0] - points[i][0];
                if(xdiff < k){
                    int equ = points[i][1] + points[j][1] + xdiff;
                    if(equ > max){
                        max = equ;
                        right_pointer = j;
                    }
                }
                else{
                    break;
                }
            }
        }
        return max;
    }
}
