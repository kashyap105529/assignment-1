package assignment;
import java.util.Scanner;
public class oddChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enter a String: ");
		String input = s.nextLine();
		for(int i=0;i<input.length();i+=2) {
			System.out.print(input.charAt(i));
		}

	}

}
