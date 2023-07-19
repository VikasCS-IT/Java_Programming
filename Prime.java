import java.util.*;

public class Prime{
    public static void main(String... adds){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int i=2;
        if(p<2){
            System.out.println("This is not prime number");
        }
        else{
            for( i = 2;i<p;i++){
                if(p%i==0){
                    System.out.println("This is not prime number");
                    break;
                }
            }
            if(i==p){
                System.out.println("This is prime number");
            }
        }
    }
}