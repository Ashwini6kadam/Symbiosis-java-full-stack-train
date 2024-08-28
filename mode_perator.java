import  java.util.*;
public class mode_perator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner X = new Scanner(System.in);

		    int num1 = 0;
		    int num2 = 0;
		    int rem = 0;

		    System.out.printf("Enter first number: ");
		    num1 = X.nextInt();

		    System.out.printf("Enter second number: ");
		    num2 = X.nextInt();

		    rem = num1 - (num1 / num2) * num2;

		    System.out.printf("Remainder is: %d", rem);
		  }
		}
	


