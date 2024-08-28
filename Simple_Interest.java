import java.util.Scanner;

public class Simple_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double SI,p,r,n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Amount");
		p=scanner.nextDouble();
		System.out.println("Rate of interest");
		r=scanner.nextDouble();
		System.out.println("Number of year");
		n=scanner.nextDouble();
		SI=(p*r*n)/100;
		System.out.println("Simple interest"+SI);

	}

}
