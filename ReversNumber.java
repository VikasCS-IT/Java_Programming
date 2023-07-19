import java.util.*;

public class ReversNumber{
    public static void main(String... afd){
    System.out.println("Enter any number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int temp,rev=0,rem;
    temp=num;
    while(temp>0){
        rem=temp%10;
        rev=rev*10+rem;
        temp=temp/10;
    }
    System.out.println(num+" of revers number is : "+rev);
}
}