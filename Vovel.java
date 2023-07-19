import java.util.*;

public class Vovel{
    public static void main (String... afd){
        System.out.println("Enter any charector between a to z");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println("Input : "+ch);
        switch (ch) {
            default:
                System.out.println("Wrong input charector. Please try again!");
               
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
                System.out.println("Vovel");
                break;
            
        }
    }
}