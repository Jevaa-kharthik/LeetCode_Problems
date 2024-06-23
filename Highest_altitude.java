public class Highest_altitude {
    public static int largestAltitude(int[] gain){
        int current_altitude = 0;
        int max = 0;
        for(int i=0; i < gain.length; i++){
            current_altitude += gain[i];
            if(current_altitude > max){
                max = current_altitude;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }
}
