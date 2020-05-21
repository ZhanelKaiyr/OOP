package homework6;

import homework6.Fish;
import java.sql.DriverManager;
import java.sql.*;

public class Accessories extends Fish{
    String url = "jdbc:mysql://localhost:3306/oop-practice4";
    String username = "zhanel";
    String password = "1234";

    private int id;
    private String name;
    private int amount;
    private double cost;
    private int fish_id;
    private double total = 0;

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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public int getFish_id() {
        return fish_id;
    }

    public void setFish_id(int fish_id) {
        this.fish_id = fish_id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public void showTable() {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM accessories");

            while(resultSet.next()) {
                Accessories accessories = new Accessories();
                accessories.setId(resultSet.getInt("id"));
                accessories.setName(resultSet.getString("name"));
                accessories.setAmount(resultSet.getInt("amount"));
                accessories.setCost(resultSet.getDouble("cost"));
                accessories.setFish_id(resultSet.getInt("fish_id"));

                System.out.println(accessories);
            }
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void totalCost() {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();
            Fish fish = new Fish();
            ResultSet resultSet = statement.executeQuery("SELECT accessories.id, accessories.name, accessories.amount, " +
                    "accessories.cost, accessories.fish_id, (fish.amount * fish.cost + accessories.amount * accessories.cost)"  +
                    "AS total FROM accessories INNER JOIN fish ON accessories.fish_id = fish.id");
            while (resultSet.next()) {
                Accessories accessories = new Accessories();
                accessories.setId(resultSet.getInt("id"));
                accessories.setName(resultSet.getString("name"));
                accessories.setAmount(resultSet.getInt("amount"));
                accessories.setCost(resultSet.getDouble("cost"));
                accessories.setFish_id(resultSet.getInt("fish_id"));
                accessories.setTotal(resultSet.getDouble("total"));


                System.out.println(accessories);
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
        return "Accessories{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", cost=" + this.cost +
                ", fish_id=" + fish_id +
                ", total=" + total +
                '}';
    }
}

