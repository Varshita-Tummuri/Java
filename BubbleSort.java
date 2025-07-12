import java.util.*;
public class BubbleSort_Algorithm {
	
	private boolean bubbleSort(int arr[], int n) {
		int temp, i , j;
		boolean swapped= false;
		
		for (i = 0; i < n-1 ; i++) 
		{
			//swapped = false;
			for (j = 0; j < n-i-1; j++) 
			{
				System.out.println("I entered the if condition-0000--->"+swapped);
				if (arr[j] > arr[j+1]) 
				{
					System.out.println("I entered the if condition-1111--->"+swapped);
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if (swapped == false) {
				System.out.println("I entered the if condition-3333--->"+swapped);
				return swapped;
			}
			System.out.println("I entered the if condition-2222--->"+swapped);
		}
		
		return swapped;
	}
	
	void printArray(int n, int arr[]) {
		int i;
		for (i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = in.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the elements of the array: " + n);
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		BubbleSort_Algorithm b1 = new BubbleSort_Algorithm();
		boolean swapped1 = b1.bubbleSort(arr, n);
		System.out.println("swapped va;lue ---3333"+swapped1 );
		if (swapped1 == true) {
			System.out.print("The sorted array is: ");
			b1.printArray(n, arr);
		}
		else {
			System.out.print("No changes are necessary.");
		}
	}

}
