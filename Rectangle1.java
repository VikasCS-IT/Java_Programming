import java.util.*;

public class Rectangle1{
    double length;
    double width;
    double calArea(){
        return length*width;
    }
    Rectangle1(double l, double w){
        System.out.println("Constructor is called.");
        length = l;
        width = w;
    }
}