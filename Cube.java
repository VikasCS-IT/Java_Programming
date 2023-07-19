import java.util.*;

public class Cube extends Rectangle1{
    double height;
    Cube(double h, double l, double w){
        super(l,w);
        height = h;
    }
    double area(){
        return height*length*width;
    }
    public static void main(String... oh){
        Cube r = new Cube(10,20,30);
        System.out.println("Aear of Cube is : "+r.area());
    }
}