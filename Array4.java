import java.util.*;

public class Array4{
    public static void main(String... jddl){
        System.out.print("Enter size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements of array : ");
        for(int i = 0;i<n;i++){            
            array[i] = sc.nextInt();
        }
        System.out.println("Enter number you want to find in the array list.");
        int num = sc.nextInt();
        for(int i = 0;i<n;i++){
            if(array[i]==num){
                System.out.println("You find : "+array[i]+" at position "+(i+1));
                break;
            }
        }
    }
}