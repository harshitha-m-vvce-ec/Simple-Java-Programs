package SimpleProgram;
import java.util.*;


public class GreetingSwitch {
	public static void main(String[] args) {
		System.out.println("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();
		switch(button){
			case 1 : System.out.println("NAMASTE!!");
			break;
			case 2 : System.out.println("HELLO!!");
			break;
			case 3 : System.out.println("HOLA AMIGO!!");
			break;
			default : System.out.println("WRONG INPUT : (");
			break;
	}
}}
