import java.util.*;

public class ThreeSumProblem_1{
    public static void main(String... sjdl){
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        boolean check=false;
        int[] array = new int[n];
        System.out.println("Enter value of array");
        for(i = 0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter target valaue");
        int target = sc.nextInt();
        for(i = 0;i<n-2;i++){
            int sum = target-array[i];
            int p = i+1;
            int q = n-1;
            while(p<q){
                int temp = array[p]+array[q];
                if(temp==sum){
                    System.out.println("Find your target in array sum of any three number");
                    check=true;
                    break;
                }
                else if(temp>sum)
                    q--;
                else
                    p++;
            }
            if(array[p]+array[q]==sum)
                break;
        }
        if(check==false)
            System.out.println("Your target value not found");
    }
}