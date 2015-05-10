import java.util.*;
import java.util.Scanner;
public class Home {
	
	public static void main (String [] args){
		System.out.println("Enter a string that you want reversed.");
		Scanner keyboard = new Scanner(System.in);
		String reverseStr = keyboard.nextLine();
		String reverse = new StringBuffer(reverseStr).reverse().toString();
		System.out.println("Your reversed String " + "\"" + reverseStr + "\""  + " is. ");
		System.out.println(reverse);
		
	}

}
