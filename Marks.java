import java.util.Scanner;
public class Marks{
public static void main(String... afd){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter marks:-");
    byte num = sc.nextByte();

    if(num <0 || num >100 ){
        System.out.println("Wrong Input! Please enter between 0 to 100.");
        return;
    }

    if(num >=90){
        System.out.println("A++ Grade");
    }
    else if(num>=75){
        System.out.println("A+ Grade");
    }
    else if(num>=65){
        System.out.println("A Grade");
    }
    else if(num>=50){
        System.out.println("B Grade");
    }
    else if(num>=35){
        System.out.println("C Grade");
    }
    else{
        System.out.println("Fail");
    }
    
}
}