import java.util.*;
class Generator{
    
    public void numbers(StringBuilder CharacterPool,int Password_length) {	
		StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < Password_length; i++) {
            int index = random.nextInt(CharacterPool.length());
            password.append(CharacterPool.charAt(index));
        }
        System.out.println("Generated Password: " + password.toString());
	}
}
public class Random_password_Generator {

	public static void main(String[] args) {		
		String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
	    String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String SPECIAL_CHARS = "!@#$%^&*()-_+=[]{}|;:,.<>?";
	    String NUMBERS = "1234567890";
	    
	    StringBuilder CharacterPool = new StringBuilder();
	    System.out.println("Welcome to the Random Password Generator!");
		System.out.println();
		
		System.out.println("Enter the length you want your password to be: ");
		Scanner in=new Scanner(System.in);
		int password_length=in.nextInt();
		String[] ans=new String[4];
		
		System.out.println("Please answer the following quetions to generate your password: ");
		System.out.println("Do you want numbers to be included in your password? Enter y for yes and n for no.");
		ans[0]=in.next();
		if(ans[0].equalsIgnoreCase("y")) {
//			g1.numbers();
			CharacterPool.append(NUMBERS);
		}
		
		System.out.println("Do you want Lowercase letters to be included in your password? Enter y for yes and n for no.");
		ans[1]=in.next();
		if(ans[1].equalsIgnoreCase("y")) {
//			g1.Lowercase();
			CharacterPool.append(LOWERCASE_CHARS);
		}
		
		System.out.println("Do you want Uppercase letters to be included in your password? Enter y for yes and n for no.");
		ans[2]=in.next();
		if(ans[2].equalsIgnoreCase("y")) {
//			g1.Uppercase();
			CharacterPool.append(UPPERCASE_CHARS);

		}
		
		System.out.println("Do you want Special Characters to be included in your password? Enter y for yes and n for no.");
		ans[3]=in.next();
		if(ans[3].equalsIgnoreCase("y")) {
//			g1.Special_Characters();
			CharacterPool.append(SPECIAL_CHARS);

		}
		
		if (CharacterPool.length() == 0) {
		    System.out.println("You must select at least one character type.");
		    return;
		}

		
		Generator g = new Generator();
		g.numbers(CharacterPool,password_length);
	}

}
