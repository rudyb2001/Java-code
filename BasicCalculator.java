//import java.util.Scanner;

class BasicCalculator {
	public static void main(String args[]) {
		Scanner bucky = new Scanner(System.in);
		double fnum, snum, answer;
		String oper;
		System.out.println("Enter first number:");
		fnum = bucky.nextDouble();
		System.out.println("Enter the operator:");
		oper = bucky.next();
		System.out.println("Enter second num:");
		snum = bucky.nextDouble();
		
		switch (oper) {
		case "+":
			answer = fnum + snum;
			break;
		case "-":
			answer = fnum - snum;
			break;
		case "*":
			answer = fnum * snum;
			break;
		case "/":
			answer = fnum / snum;
			break;
		case "%":
			answer = fnum % snum;
			break;
		case "^":
			answer = Math.pow(fnum, snum);
			break;
		default:
			answer = fnum + snum;
		break;
		}
		
		System.out.println(answer);
	}
}
