import java.util.*;

public class BinarySearch{
    public static void main(String... lsd){
        int i,left=0,mid;
        boolean check=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter value of array");
        for(i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter target value");
        int target = sc.nextInt();
        int right = n-1;
        while(left<=right){
            mid = (left+right)/2;
            if(array[mid]==target){
                check=true;
                System.out.println("Your target value find at index : "+(mid+1));
                break;
            }
            else if(array[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        if(check==false){
            System.out.println("Your target value not found");
        }
    }
}