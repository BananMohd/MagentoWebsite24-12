package myTestcases;

import java.util.Random;

public class Parameters {

	Random rand = new Random();


	String[] FirstNames = { "Alice", "Bob", "Charlie", "David", "Emma", "Frank", "Grace", "Henry", "Isabel", "Jack" };

	String[] lastNames = { "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore",
			"Taylor" };
	String CommonPassword = "Asd123!@#$";
	
	int randomIndex = rand.nextInt(10);
	int randomEmailId = rand.nextInt(9999); 
	
	String emailID = FirstNames[randomIndex]+lastNames[randomIndex]+randomEmailId+"@"+"gmail.com"; 
	

	
	///public class PasswordGenerator {
	 //   private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
	   // private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
	   // private static final String DIGIT = "0123456789";
	    //private static final String SPECIAL_CHAR = "!@#$%^&*()_-+=<>?/{}|~";

	    //private static final String PASSWORD_CHARS = CHAR_LOWER + CHAR_UPPER + DIGIT + SPECIAL_CHAR;
	    //private static final int PASSWORD_LENGTH = 12;
	    //int a = 10 ; 
	    //public static String generatePassword() {
	       // StringBuilder password = new StringBuilder(PASSWORD_LENGTH);
	      //  SecureRandom random = new SecureRandom();

	        //for (int i = 0; i < PASSWORD_LENGTH; i++) {
	          //  int randomCharIndex = random.nextInt(PASSWORD_CHARS.length());
	           // password.append(PASSWORD_CHARS.charAt(randomCharIndex));
	        //}

	        //return password.toString();
	    //}
	

	//}
	
	
	
}
