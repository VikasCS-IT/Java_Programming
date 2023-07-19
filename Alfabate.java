import java.util.*;

public class Alfabate{
    public static void main(String... afd){
        System.out.println("Enter any charector");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println("This is an alfabate charector.");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("This is number value.");
        }
        else{
            System.out.println("This is special symbol.");
        }
    }
}