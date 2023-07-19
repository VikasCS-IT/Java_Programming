// wap to enter day no. and display day name
import java.util.*;
class P6{
	public static void main(String[] afe){
		int dayno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day no (1-7)");
		dayno=sc.nextInt();
		switch(dayno){
			case 1:
			System.out.println("Sunday");
			break;
			case 2:
			System.out.println("Monday");
			break;
			case 3:
			System.out.println("Tuesday");
			break;
			case 4:
			System.out.println("Wednextday");
			break;
			case 5:
			System.out.println("Thursday");
			break;
			case 6:
			System.out.println("Friday");
			break;
			case 7:
			System.out.println("Saturday");
			break;
			default:
			System.out.println("Invalid day no");
			break;
		}
	}
}