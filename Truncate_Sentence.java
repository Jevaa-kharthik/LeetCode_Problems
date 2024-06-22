import java.util.*;

public class Truncate_Sentence{

    public static String truncate(String s, int k){
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                count += 1;
            }
            if(k == count) break;
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        sc.close();
        System.out.println(truncate(str, num));
    }
}