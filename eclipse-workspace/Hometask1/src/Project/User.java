package Project;

public class User {
public static void main(String args[]){
	UserDetails user= new UserDetails();
	user.setName("Zhanel");
	user.setEmail("zhanel@gmail.com");
	System.out.println(user.getName());
	System.out.println(user.getEmail());
	
	
	FruitDetails fruit= new FruitDetails("apple","red",100);
	
	System.out.println(fruit.getFName());
	fruit.setFName("orange");
	System.out.print(fruit.getFName()+" ");
	System.out.print(fruit.getColor()+ " ");
	System.out.print(fruit.getPrice());
}
}
