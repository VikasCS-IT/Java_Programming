import java.util.*;

public class SumOfDigit{
    public static void main(String... afd){
        System.out.println("Enter any number.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num>0){  
            sum += num%10;
            num /= 10;
        }
        System.out.println(sum);
    }
}