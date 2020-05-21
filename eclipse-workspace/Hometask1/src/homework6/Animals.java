package homework6;

public abstract class Animals {
private int id;
private String name;
private double cost;
private int amount;
Animals(){
	
}
	Animals(int id,String name,double cost, int amount){
		this.id=id;
		this.name=name;
		this.amount=amount;
		this.cost=cost;
	}
	


public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public double getCost() {
    return cost;
}

public void setCost(int cost) {
    this.cost = cost;
}

public int getAmount() {
    return amount;
}

public void setAmount(int amount) {
    this.amount = amount;
}
  
public String toString() {
	return "There are several types of animals";
}

}
