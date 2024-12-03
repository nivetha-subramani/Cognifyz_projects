package passwordchecker;
import java.util.*;
public class security {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

	     System.out.print("Enter your Password: ");
	     String password = scan.nextLine();
	     scan.close();

	     String strengthword = checkPasswordStrength(password);
	     System.out.println(strengthword);
	}

    public static String checkPasswordStrength(String password) {
    	
    	int lengthcriteria = 6;
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        String specialCharacters = "!@#$%^&*()_+[]{}|;:,.<>?~";
        
        if(password.length() >= lengthcriteria) {

            
            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUppercase = true;
                } else if(Character.isLowerCase(c)) {
                    hasLowercase = true;
                } else if(Character.isDigit(c)) {
                    hasDigit = true;
                } else if(specialCharacters.contains(String.valueOf(c))) {
                    hasSpecial = true;
                }
            }
            
            if(hasUppercase && hasLowercase && hasDigit && hasSpecial) 
            {
                return "Entered a Strong Password!";
            } 
            else 
            {
                return "Entered a Weak Password. Please include uppercase,lowercase &specialcharacter";
            }
        } 
        
            else 
            {
            return "Password length must be at least " + lengthcriteria + " characters!";
            }
    }

}

		    	
		    	

		       
		       

		           
		           

