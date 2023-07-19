import java.util.*;

class MethoOverloading{
    public static void main(String... aj){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        Calculation c = new Calculation();
        System.out.println(c.sum(x,y));
        System.out.println(c.sum(x,y,z));
        c.printSum("vikas","kumar");
    }
}