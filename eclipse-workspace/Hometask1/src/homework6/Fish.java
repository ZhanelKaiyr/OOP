package homework6;

import java.sql.DriverManager;
import java.sql.*;

public class Fish extends Animals{
	    String url = "jdbc:mysql://localhost:3306/oop-practice4";
	    String username = "zhanel";
	    String password = "1234";
	    
	    private int id;
	    private String name;
	    private double cost;
	    private int amount;
	    Fish(){
	    	
	    }
	    
	    Fish(int id,String name,double cost, int amount){
			super(id,name,cost,amount);
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

	    public double total() {
	        return this.amount * this.cost;
	    }


	    public void showTable() {
	        try {
	            Connection connection = DriverManager.getConnection(url, username, password);

	            Statement statement = connection.createStatement();
	            ResultSet resultSet = statement.executeQuery("SELECT * FROM fish");

	            while (resultSet.next()) {
	                Fish fish = new Fish();
	                fish.setId(resultSet.getInt("id"));
	                fish.setName(resultSet.getString("name"));
	                fish.setAmount(resultSet.getInt("amount"));
	                fish.setCost(resultSet.getInt("cost"));

	                System.out.println(fish);
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
	                ResultSet resultSet = statement.executeQuery("SELECT id, name, amount, cost, (amount * cost) FROM fish");


	                while (resultSet.next()) {
	                    Fish fish = new Fish();
	                    fish.setId(resultSet.getInt("id"));
	                    fish.setName(resultSet.getString("name"));
	                    fish.setAmount(resultSet.getInt("amount"));
	                    fish.setCost(resultSet.getInt("cost"));
	                    fish.total();


	                    System.out.println(fish);
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
	        return "Fish{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", cost=" + cost +
	                ", amount=" + amount +
	                ", total=" + total() +
	                '}';
	    }
	}


