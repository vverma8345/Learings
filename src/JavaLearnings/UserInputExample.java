package JavaLearnings;
import java.util.Scanner;

public class UserInputExample {

	public static void main(String[] args) {
		
		
		System.out.println("Enter your massage !!");
		Scanner sn = new Scanner(System.in);
		String msg = sn.nextLine();
		System.out.println(msg);
	}

}
