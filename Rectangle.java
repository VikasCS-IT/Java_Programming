import java.util.*;

public class Rectangle{
    double length;
    double width;
    Rectangle(){
        System.out.println("Constructor is called.");
    }
    double calculateArea(){
        return length*width;
    }
    public static void main(String[] sd){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.length = 2.5;
        r1.width = 5.2;
        r2.length = 52.2;
        r2.width = 12.2;
        System.out.println(r1.calculateArea());
        System.out.println(r2.calculateArea());
    }
}