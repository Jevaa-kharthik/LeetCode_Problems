
public class Maximum_Points {
    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;

        for(int i = 0; i < k; i++){
            sum += cardPoints[i];
        }
        int max = sum;
        for(int i = 0; i < k; i++){
            sum += cardPoints[n - 1 - i] - cardPoints[k - 1 - i];
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {9,7,7,9,7,7,9};
        int card = 7;
        System.out.println(maxScore(arr, card));
    }
    
}
