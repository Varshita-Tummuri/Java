import java.util.*;
public class Password_Strength_checker {

	public static void main(String[] args) {
		
		String numbers = "0123456789";
		String lower_case = "abcdefghijklmnopqrstuvwxyz";
		String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String special_characters = "!@#$%^&*()-_+=[]{}|;:,.<>?";
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your password to check its strength: ");
		String password = in.next();
		
		StringBuilder pass_num = new StringBuilder();
		StringBuilder pass_lower = new StringBuilder();
		StringBuilder pass_upper = new StringBuilder();
		StringBuilder pass_special = new StringBuilder();

		
		for(int i=0;i<password.length();i++) {
			
			for(int j=0;j<numbers.length();j++) {
				if(password.charAt(i)==numbers.charAt(j)) {
					
					pass_num.append(password.charAt(i));
					
				}
			}
			for(int j=0;j<lower_case.length();j++) {
				if(password.charAt(i)==lower_case.charAt(j)) {
					
					pass_lower.append(password.charAt(i));
					
				}
			}
			for(int j=0;j<upper_case.length();j++) {
				if(password.charAt(i)==upper_case.charAt(j)) {
					
					pass_upper.append(password.charAt(i));
					
				}
			}
			for(int j=0;j<special_characters.length();j++) {
				if(password.charAt(i)==special_characters.charAt(j)) {
					
					pass_special.append(password.charAt(i));
					
				}
			}
		}
		
		int score = 0;
		if (pass_num.length()!=0) {
			score++;
		}
		if (pass_lower.length()!=0) {
			score++;
		}
		if (pass_upper.length()!=0) {
			score++;
		}
		if (pass_special.length()!=0) {
			score++;
		}
		
		if(score==4) {
			System.out.println("The password is STRONG");
		}
		else if(score==3){
			System.out.println("The password is MODERATE");
		}
		else if(score==2){
			System.out.println("The password is WEAK");
		}
		else{
			System.out.println("The password is VERY WEAK");
		}
	}

}
