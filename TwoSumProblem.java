import java.util.*;

public class TwoSumProblem{
    public static void main(String... sd){
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println();
        for(int i = 0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter target number.");
        int target = sc.nextInt();
        boolean check = false;
        int j;
        for(int i = 0;i<n-1;i++){
            
            for(j = i+1;j<n;j++){
                if(array[i]+array[j]==target){
                    System.out.println("YES");
                    check = true;
                    break;
                }
            }
            if(check)
                break;
        }
        if(check== false){
            System.out.println("NO");
        }

    }
}