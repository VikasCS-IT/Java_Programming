import java.util.*;

public class Pattern4{
    public static void main(String... ss){
        System.out.println("Enter size of pattern line");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p;
        System.out.println();
        for(int i = 0;i<n;i++){
            p = (i%2==0)?1:0;
            for(int j = 0;j<=i;j++){
                System.out.print(p+"\t");
                p = (p==1)?0:1;
            }
            System.out.println();
        }
    }
}