import java.util.*;
class Average_Grade_Calculator{
	public int calculator(int arr1[]) {
		int arrayLength=arr1.length;
		int total=0;
		for(int i=0;i<arrayLength;i++) {
			total=total+arr1[i];
		}
		int total_average=total/arrayLength;
		return total_average;
	}
}
public class Student_Grade_Calculator {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number of subjects: ");
		int no_of_subs=in.nextInt();
		
		int[] arr1=new int[no_of_subs];
		
		for(int i=0;i<no_of_subs;i++) {
			System.out.println("Enter the grade for sub "+ (i+1));
			arr1[i]=in.nextInt();
		}
		
		Average_Grade_Calculator a1 = new Average_Grade_Calculator();
		int average=a1.calculator(arr1);	
		System.out.println("The average of your grades is: "+ average);
		
	}

}
