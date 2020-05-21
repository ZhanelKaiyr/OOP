package homework2;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Validator {
		
		public static boolean  checkAge(int age) {
			if (age<18) {
				System.out.print("Your age are under 18 ");
				return false ;
			}
			else {
				return true;
			}	}
		
		
		   public static boolean checkPassword ( String password)
	        {
	                boolean valid = true;
	                if (password.length() <= 8)
	                {
	                        System.out.println("Password should be  more than 8 characters in length.");
	                        valid = false;
	                }
	                
	                String upperCaseChars = "(.*[A-Z].*)";
	                if (!password.matches(upperCaseChars ))
	                {
	                        System.out.println("Password should contain at least one upper case alphabet");
	                        valid = false;
	                }
	                String lowerCaseChars = "(.*[a-z].*)";
	                if (!password.matches(lowerCaseChars ))
	                {
	                        System.out.println("Password should contain at least one lower case alphabet");
	                        valid = false;
	                }
	                String digits = "(.*[0-9].*)";
	                if (!password.matches(digits))
	                {
	                        System.out.println("Password should contain at least one digit.");
	                        valid = false;
	                }
	                String specialSymbols = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
	                if (!password.matches(specialSymbols ))
	                {
	                        System.out.println("Password should contain atleast one special symbol");
	                        valid = false;
	                       
	                }
	                
	                if (valid)
	                {
	                        System.out.println("Password is valid.");
	                        return true;
	                }
	                else {
	                	 return false;
	                }
	                
	        }
		   
		   public static boolean checkDate(String dateOfBirth){
		        if(dateOfBirth.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}"))
		        {
		            SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy");
		            dateformat.setLenient(false);
		            try {
		                Date date1=dateformat.parse(dateOfBirth);
		                return true;
		            } catch (ParseException e) {
		                System.out.println("Please, try to input data by the given format.");
		                return false;
		            }
		        }
		        else
		            System.out.println("Please, try to input data by the given format.");
		        return false;
		    }
		   
		

}