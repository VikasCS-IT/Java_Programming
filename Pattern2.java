import java.util.*;

public class Pattern2{
    public static void main(String... sdhh){
        System.out.println("Enter number line of pattern : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println();
        for(int i = 0;i<num;i++){
            for(int j = i;j<num;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}