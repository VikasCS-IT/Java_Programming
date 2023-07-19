import java.util.*;

public class ThreeSumProblem{
    public static void main(String... jls){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] array = new int[n];
        boolean check = false;
        System.out.println("Enter value of array");
        for(int i = 0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter target value");
        int target = sc.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
                    if(array[i]+array[j]+array[k]==target){
                        System.out.println("Finded your target values.");
                        check= true;
                        break;
                    }
                }
            }
        }
    }
}