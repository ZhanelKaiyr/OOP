package homework6;

public class Main {

	 public static void main(String[] args) {
	        Fish fish = new Fish();
	        fish.totalCost();
	        System.out.println("-----------------------------------------");
	        Accessories accessories = new Accessories();
	        accessories.showTable();
	        System.out.println("-----------------------------------------");
	        accessories.totalCost();
	        System.out.println("-----------------------------------------");
	        Reptiles reptiles = new Reptiles();
	        reptiles.totalCost();
	        
	    }

}
