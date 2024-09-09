import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SampleDatabase {
    public void execute_simpledatabase()
    {
        String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
        String user = "root";
        String password = "root";

        Connection connection = null;
        Statement statement = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");


            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();


            String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS testdb";
            statement.executeUpdate(createDatabaseSQL);
            System.out.println("Database created successfully!");


            statement.close();
            connection.close();


            String dbUrl = "jdbc:mysql://127.0.0.1:3306/testdb"; // Now specify the 'testdb' database
            connection = DriverManager.getConnection(dbUrl, user, password);
            statement = connection.createStatement();


            String createTableSQL = "CREATE TABLE IF NOT EXISTS users (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "age INT)";
            statement.executeUpdate(createTableSQL);
            System.out.println("Table created successfully!");


           // String insertRecordSQL = "INSERT INTO users (name, age) VALUES ('John Doe', 30)";
            //statement.executeUpdate(insertRecordSQL);
            System.out.println("Record inserted successfully!");

            String query="select * from users";
            ResultSet resultSet=statement.executeQuery(query);
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                int age=resultSet.getInt("age");
                System.out.println("Id: "+id);
                System.out.println("Name: "+name);
                System.out.println("Age: "+age);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


