import java.util.*;

public class Hcf{
    public static void main(String... adj){
        System.out.println("Enter first number who want to HCF");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter second number who want to HCF");
        int num2 = sc.nextInt();
        int num = (num1<num2)?num1:num2;
        while(true){
            if(num1%num==0 && num2%num==0){
                System.out.println(num1+" and "+num2+" of HCF is : "+num);
                break;                                                                                                                                                                                          
            }
            num--;
        }
    }
}