package SimpleProgram;
import java.util.*;
public class AdultOrNot {

	public static void main(String[] args) {
		System.out.println("Enter Your age!!");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		if(a>=18) {
			System.out.println("Your are ADULT!!!");
		}
		else {
			System.out.println("You are not an ADULT :(");
		}
	}

}
