import java.util.*;

class tempCalculator{
	Scanner in=new Scanner(System.in);
	
	public void Convert_intoCelcius(double f) {
		double temp1=f-32;
		double final_temp=temp1*0.55;
		System.out.printf("The converted from Fahrenheit to Celcius is: "+final_temp);
		System.out.println();
	}
	
	public void Convert_intoFahrenheit(double c) {
		double t=c*1.8;
		double final_temp1=t+32;
		System.out.printf("The converted from Celcius to Fahrenheit is: "+final_temp1);
		System.out.println();
	}
	
	public void menu() {
		System.out.println("***MENU***");
		System.out.println("1. Convert from Fahrenheit to Celcius");
		System.out.println("2. Convert from Celcius to Fahrenheit");
		System.out.println("Enter your choice: ");
		int choice=in.nextInt();
		switch(choice) {
		case 1: 
			System.out.println("Enter the temperature in Farenheit: ");
			double fahrenheit=in.nextDouble();
			Convert_intoCelcius(fahrenheit);
			break;
		case 2: 
			System.out.println("Enter the temperature in Celcius: ");
			double celcius=in.nextDouble();
			Convert_intoFahrenheit(celcius);
			break;
		default:
			System.out.println("Invalid Choice.");
		}
		
	}
	
}
public class Temperature_Converter {

	public static void main(String[] args) {
		tempCalculator t1=new tempCalculator();
		while(true) {
			t1.menu();
		}
//		t1.Convert_intoCelcius(54.01);
	}

}
