public class NesteIfElse{
    public static void main(String... sfs){
        int number = 35;
        if(number <= 23){
            System.out.println("Number is less than 23");
        } else if(number > 13 && number <= 23){
            System.out.println("Number is greater than 13 and less than 23");
        } else if(number > 23 && number <= 32){
            System.out.println("Number is greater than 23 and less than 32");
        }

        int a = 23;
        int b = 32;
        int maxOfBothNumber = 0;
        if(a > b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }
    }
}