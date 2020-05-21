package homework6;
import java.sql.DriverManager;
import java.sql.*;

public class Reptiles extends Animals{

	 String url = "jdbc:mysql://localhost:3306/oop-practice4";
	    String username = "zhanel";
	    String password = "1234";
	    
	    private int id;
	    private String name;
	    private double cost;
	    private int amount;
	    private String type;
	    Reptiles(){
	    	
	    }
	    
	    Reptiles(int id,String name,String type,double cost, int amount){
			super(id,name,cost,amount);
			this.type=type;
			
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
	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        this.type = type;
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

	    public double total() {
	        return this.amount * this.cost;
	    }


	    public void showTable() {
	        try {
	            Connection connection = DriverManager.getConnection(url, username, password);

	            Statement statement = connection.createStatement();
	            ResultSet resultSet = statement.executeQuery("SELECT * FROM reptiles");

	            while (resultSet.next()) {
	                Reptiles reptiles = new Reptiles();
	                reptiles.setId(resultSet.getInt("id"));
	                reptiles.setName(resultSet.getString("name"));
	                reptiles.setType(resultSet.getString("type"));
	                reptiles.setAmount(resultSet.getInt("amount"));
	                reptiles.setCost(resultSet.getInt("cost"));

	                System.out.println(reptiles);
	            }
	            resultSet.close();
	            statement.close();
	            connection.close();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	        public void totalCost() {
	            try {
	                Connection connection = DriverManager.getConnection(url, username, password);

	                Statement statement = connection.createStatement();
	                ResultSet resultSet = statement.executeQuery("SELECT id, name , type, amount, cost, (amount * cost) FROM Reptiles");


	                while (resultSet.next()) {
	     	                Reptiles reptiles = new Reptiles();
	     	                reptiles.setId(resultSet.getInt("id"));
	     	                reptiles.setName(resultSet.getString("name"));
	     	                reptiles.setType(resultSet.getString("type"));
	     	                reptiles.setAmount(resultSet.getInt("amount"));
	     	                reptiles.setCost(resultSet.getInt("cost"));
	                    reptiles.total();


	                    System.out.println(reptiles);
	                }
	                resultSet.close();
	                statement.close();
	                connection.close();

	            } catch (SQLException e) {
	                e.printStackTrace();
	        }
	    }

	    @Override
	    public String toString() {
	        return "Reptiles{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", cost=" + cost +
	                ", amount=" + amount +
	                ", total=" + total() +
	                ", type=" + type +
	                '}';
	    }
	}




