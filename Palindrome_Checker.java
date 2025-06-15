import java.util.*;
class Palindrom{
	public boolean Checker(String a) {
		String s=a.toLowerCase();
		String sentence1=s.replaceAll("\\s+","");
		//charAt() method is used to retrieve a character at a specific index in the string
		int j=sentence1.length()-1;
		int i=0;
		while(i<j) {
			if(sentence1.charAt(i)!=sentence1.charAt(j)) {
				return false;
			}
			else {
				i++;
				j--;
			}
		}
		return true;
	}
}
public class Palindrome_Checker {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a word/phrase to check if its a palindrom: ");
		String s=in.nextLine();
		Palindrom p1=new Palindrom();
		if(p1.Checker(s)) {
			System.out.println(s+" is a palindrome.");
		}
		else {
			System.out.println(s+" is not a palindrome.");
		}
	}
}
 
