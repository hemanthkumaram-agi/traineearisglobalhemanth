import java.util.Scanner;
public class Factorial {
public static void main(String args[])
{
	int number;
	System.out.println("Enter which tables you want to print:");
	Scanner input = new Scanner(System.in);
	number = input.nextInt();
	int i,fact=1;
		for(i=1;i<=number;i++) {
		fact=fact*i;
	}
System.out.println("Factorial of"+number+"is:"+fact);
}
}
