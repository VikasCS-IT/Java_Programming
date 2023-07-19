import java.util.*;

public class Pelindrom{
    public static void main(String... adr){
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp,rem,rev=0;
        temp=num;
        while(temp>0){
            rem = temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(num==rev){
            System.out.println("This is pelindrom number.");
        }
        else{
            System.out.println("This is not pelindrom number.");
        }  
    }
}