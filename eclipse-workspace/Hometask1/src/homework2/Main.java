package homework2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		
		
		 String firstname;
	        while(true){
	            System.out.println("Enter your first name: ");
	            firstname = user.nextLine();
	            if(!firstname.isEmpty()){
	                break;
	            }
	            System.out.println("You have to fill all fields.");
	        }
	        
	        String secondname;
	        while(true){
	            System.out.println("Enter your second name: ");
	            secondname = user.nextLine();
	            if(!secondname.isEmpty()){
	                break;
	            }
	            System.out.println("You have to fill all fields.");
	        }
	        
	        int age;
	        while(true){
	            System.out.println("Enter your age: ");
	           String  ageage= user.nextLine();
	            if(!ageage.isEmpty()){
	            	age=Integer.parseInt(ageage);
	            	if(Validator.checkAge(age)==true) {
	                break;
	                }
	                else {
	                	continue;
	                }
	            }
	            System.out.println("You have to fill all fields.");
	        }
	        String gender;
	        while(true) {
	            System.out.println("Enter your gender: ");
	            gender = user.nextLine();
	            if(!gender.isEmpty()){
	                break;
	            }
	            System.out.println("You have to fill all fields.");
	        }
	        
	        String password;
	        while(true) {
	            System.out.println("Enter your password: ");
	            password = user.nextLine();
	            if(!password.isEmpty()) {
	                if (Validator.checkPassword(password) == true) {
	                    break;
	                }
	                else{
	                    continue;
	                }
	            }
	            System.out.println("You have to fill all fields.");
	        }

	        String dateofbirth;
	        while(true) {
	            System.out.println("Enter your date of birth in a format of dd/mm/yyyy: ");
	            dateofbirth = user.nextLine();
	            if(!dateofbirth.isEmpty()) {
	                if (Validator.checkDate(dateofbirth) == true) {
	                    break;
	                }
	                else{
	                    continue;
	                }
	            }
	            System.out.println("You have to fill all fields.");
	        }
	        
	        User  user1=new User(firstname , secondname, age, gender ,password, dateofbirth);
	      
	}
}
