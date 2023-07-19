import java.util.*;

public class NumberOfDigit{
    public static void main(String... afdj){
    System.out.println("Enter any number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int counter=0;
    while(num>0){
        num=num/10;
        counter++;
    }
    System.out.println(counter);
    }
}