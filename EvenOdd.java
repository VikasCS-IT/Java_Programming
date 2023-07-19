import java.util.Scanner;

public class EvenOdd{
    public static void main (String... arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value : ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("This number is even.");
        }
        else{
            System.out.println("This number is odd.");
        }
    }
}