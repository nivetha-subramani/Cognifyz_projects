package randnogenerator;
import java.util.*;
public class newpassword {

	public static void main(String[] args) {
		String capsletter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smlletter="abcdefghijklmnpqrstuvwxyz";
		
		String num="0123456789";
		String specialchar="!@#$%^&*_+|;:,.<>?~" ;
		String combination= capsletter+smlletter+specialchar+num;
		int len=8;
		char[] password =new char[len];
		Random rand= new Random();
		for(int i=0;i<len;i++)
		{
			password[i]= combination.charAt(rand.nextInt(combination.length()));
			
		}
		System.out.println("Here is your password: "+ new String(password));
		

	}

}
