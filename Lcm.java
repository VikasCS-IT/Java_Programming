import java.util.*;

public class Lcm{
    public static void main(String... adj){
        System.out.println("Enter first number who want to LCM");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter second number who want to LCM");
        int num2 = sc.nextInt();
        int num;
        if(num1>=num2){
            num = num1;
        }
        else{
            num = num2;
        }
        while(true){
            if(num%num1==0 && num%num2==0){
                System.out.println(num1+" and "+num2+" of LCM is : "+num);
                break;
            }
            num++;
        }
    }
}