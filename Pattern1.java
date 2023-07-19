import java.util.*;

public class Pattern1{
    public static void main(String... sdhh){
        System.out.println("Enter number line of pattern : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println();
        for(int i = 0;i<num;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int i = 0;i<num;i++){
            for(int j = i;j<num;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int i = 0;i<num;i++){
            for(int j = 0;j<2*num-1;j++){
                if((j<num-i-1)||(j>num+i-1)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }        
    }
}