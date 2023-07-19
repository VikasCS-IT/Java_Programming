import java.util.Scanner;

public class LeepYear{
    public static void main(String... age){
        System.out.println("Enter 4 digit number of year.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%400==0){
            System.out.println("This is leep year.");
        }
        else{
            if(num%100==0){
                System.out.println("This is not leep year.");
            }
            else{
                if(num%4==0){                   
                    System.out.println("This is leep year.");
                }
                else{
                    System.out.println("This is not leap year.");
                }
            }
        }
    }
}