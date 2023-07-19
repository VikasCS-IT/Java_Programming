  import java.util.*;

  public class SubArray{
      public static void main(String... wj){
          int max,sum=0;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter size of array.");
          int n = sc.nextInt();
          int x = -1;
          int y = -1;
          int[] array = new int[n];
          for(int i = 0;i<n;i++){
              array[i] = sc.nextInt();
          }
          max = Integer.MIN_VALUE;
          for(int i = 0;i<n;i++){
              for(int j = i;j<n;j++){
                  sum = 0;
                  for(int k = i;k<=j;k++){
                      sum += array[k];
                  }
                  if(sum>max){
                      max = sum;
                      x = i;
                      y = j;
                  }
              }
          }
          System.out.println("Selected  Subarray : ");
          for(int p=x; p<=y; p++){
              System.out.print(array[p]+" ");
          }
          System.out.println(max+" is max number");
      }
  }