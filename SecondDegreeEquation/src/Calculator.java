import java.util.Scanner;
import java.lang.Math;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your input method:"
				+ "\n 1. Three arguments"
				+ "\n 2. One  argument");
		
		String calculatorType=scanner.next();
	
		switch (calculatorType) {
		case "1":
			System.out.print("Please enter the value of a: ");
			double a = scanner.nextDouble();
			System.out.print("Please enter the value of b: ");
			double b = scanner.nextDouble();
			System.out.print("Please enter the value of c: ");
			double c = scanner.nextDouble();
			//System.out.println("The discriminant is: " + D);
			calculator(a,b,c);
			break;
			
		case "2":
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the value of you a,b,c!");
			String calculation= scan.nextLine();
			a = Double.parseDouble(calculation.split(",")[0]);
			b = Double.parseDouble(calculation.split(",")[1]);
			c = Double.parseDouble(calculation.split(",")[2]);
			//System.out.println("a: " + a + " b: " + b + " c:" +c);
			calculator(a,b,c);
			break;
		
		default:
			System.out.println("Please enter a valid calculation type");
			break;
		}
		
		scanner.close();
	}
	
	public static void calculator(double a, double b, double c) {
		double result;
		double result2;
		double D = (b*b)-(4*a*c);
		
		double sqrt = Math.sqrt(D);
		if(D == 0) {
			result=(-1*b)/(2*a);
			System.out.println("The result is: " + result);
		} else {
			if(D >0) {
				result =((-1*b)+sqrt)/(2*a);
				result2 =((-1*b)-sqrt)/(2*a);
				System.out.println("The results are: " + result + " and " +result2);
			}else {
				System.out.println("There is no real root.");
			}
		}
	}
	
}
