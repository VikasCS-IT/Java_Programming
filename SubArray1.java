
//   kadan's algorithm

import java.util.*;

public class SubArray1{
    public static void main(String... hs){
        System.out.println("Enter size of array.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter value of array.");
        for(int i = 0;i<n;i++){
            array[i] = sc.nextInt();
        }
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            currentSum += array[i];
            if(currentSum<0)
                currentSum = 0;
            if(maxSum<currentSum)
                maxSum=currentSum;
        }
        System.out.println(maxSum+" is a max number.");
    }
}