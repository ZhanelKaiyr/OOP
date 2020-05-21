package Project;

public class FruitDetails {
	private String fname;
	private String color;
	private int price;
	
	FruitDetails (String a,String b,int c){
		fname=a;
		color=b;
		price=c;
	}
	public void setFName(String  n){
	    this.fname = n;
	}

	public void setColor(String  c){
	    this.color=c;
	}
	public void setPrice(int  p){
	    this.price=p;
	}

	public String getFName(){
	    return fname;
	}

	public String getColor(){
	    return color;
	}
	public int getPrice(){
	    return price;
	}
}
