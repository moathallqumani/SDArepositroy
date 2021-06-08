import java.util.*;
public class main {
	static Scanner scan = new Scanner (System.in);
public static void main(String[] args) {
	
	
	
	
    calculator();

}
static void calculator() {
	
	try {
	double num1 ;
	double num2;
	System.out.println("Choose the number of the opreator:\n1- + \n2- * \n3- - \n4- /");
	int opre = scan.nextInt() ; 
		switch(opre){
		case 1:
		System.out.println("Enter a number: ");
		num1 = scan.nextDouble();
		System.out.println("Enter a second number: ");
		num2 = scan.nextDouble();
		
		System.out.println("\n--------\n"+(num1+num2));
		break;
		case  2 :
		System.out.println("Enter a number: ");
		num1 = scan.nextDouble();
		System.out.println("Enter a second number: ");
		num2 = scan.nextDouble();
		
		System.out.println("\n--------\n"+(num1*num2));
		break;
		case 3: 
		System.out.println("Enter a number: ");
		num1 = scan.nextDouble();
		System.out.println("Enter a second number: ");
		num2 = scan.nextDouble();
		
		System.out.println("\n--------\n"+(num1-num2));
		break;
		case  4 :
		System.out.println("Enter a number: ");
		num1 = scan.nextDouble();
		System.out.println("Enter a second number: ");
		num2 = scan.nextDouble();
		System.out.println("\n--------\n"+(num1/num2));
		
		break;
		
	}
	}catch(Exception ex) {
	System.out.println("Wrong opreation\n - Try Again!");
	calculator();
}
}
}



