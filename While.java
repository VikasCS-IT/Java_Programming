import java.util.*;

public class While{
    public static void main(String... afd){
        System.out.println("Enter any number of n");
        Scanner sc = new Scanner(System.in);
        int num = 100;
        int i=1;
        while(i<=10){
            int tmp = i;
            while( tmp <= i+90){
                System.out.print(tmp+"\t");
                tmp += 10;
            }
            System.out.println();
            i++;
        }
    }
}