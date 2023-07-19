import java.util.*;

public class Fibbonancies{
    public static void main(String... ads){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fibbonancies number : ");
        int a = 0;
        int b = 1;
        int c= a+b;
        int n = sc.nextInt();
        System.out.println(a+" "+b);
        for(int i = 0;i<n;i++){
            a = b;
            b = c;
            c = a+b;
            System.out.println(c);
        }
    }
}