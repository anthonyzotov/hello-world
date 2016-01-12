import java.util.Scanner;

public class HelloWorld2{
	public static void main (String [] args){
		System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter line you would like to be displayed: ");
		String line = sc.next();
		System.out.println(line);
	}
}
