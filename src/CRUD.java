import java.sql.*;
import java.util.Scanner;

public class CRUD {
    public void crud_operations() {
        String url = "jdbc:mysql://127.0.0.1:3306/testdb";
        String userName = "root";
        String password = "root";
        Scanner obj = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (RuntimeException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        while (true) {
            try {
                Connection connection = DriverManager.getConnection(url, userName, password);
                Statement stmt = connection.createStatement();
                System.out.println("\nChoose Your Option:");
                System.out.println("Enter  1 to Continue.");
                System.out.println("Enter  0 to Exit.");
                System.out.println("Enter  2 to Create a new Database.");
                System.out.println("Enter  3 to Create a new Table.");
                System.out.println("Enter  4 to Delete a Table.");
                System.out.println("Enter  5 to Update a Table.");
                System.out.println("Enter  6 to Insert Data into a Table.");

                int selectOption = obj.nextInt();
                obj.nextLine();  // Consume newline

                if (selectOption == 0) {
                    System.out.println("Exiting program...");
                    break;
                }

                switch (selectOption) {
                    case 1:
                        // Continue Program
                        continue;

                    case 2:
                        System.out.println("Enter your Database Name:");
                        String db_name = obj.nextLine();

                        String createDatabase = "CREATE DATABASE IF NOT EXISTS " + db_name;
                        stmt.executeUpdate(createDatabase);

                        String dburl = "jdbc:mysql://127.0.0.1:3306/" + db_name;
                        connection = DriverManager.getConnection(dburl, userName, password);
                        stmt = connection.createStatement();

                        System.out.println("Database " + db_name + " created and connected successfully!");
                        break;

                    case 3:
                        System.out.println("Enter your Table Name:");
                        String table_name = obj.nextLine();

                        System.out.println("Enter number of columns in Table:");
                        int colms = obj.nextInt();
                        obj.nextLine();  // Consume newline

                        StringBuilder createTableQuery = new StringBuilder("CREATE TABLE IF NOT EXISTS " + table_name + " (");

                        for (int i = 0; i < colms; i++) {
                            System.out.println("Enter the name of column " + (i + 1) + ":");
                            String column_name = obj.nextLine();

                            System.out.println("Enter the data type for column " + (i + 1) + ":");
                            String data_type = obj.nextLine();

                            createTableQuery.append(column_name).append(" ").append(data_type);

                            if (i < colms - 1) {
                                createTableQuery.append(", ");
                            }
                        }

                        createTableQuery.append(")");
                        stmt.executeUpdate(createTableQuery.toString());
                        System.out.println("Table " + table_name + " created successfully!");
                        break;

                    case 4:
                        System.out.println("Enter the name of the Table to delete:");
                        String del_table_name = obj.nextLine();

                        String deleteTableQuery = "DROP TABLE IF EXISTS " + del_table_name;
                        stmt.executeUpdate(deleteTableQuery);
                        System.out.println("Table " + del_table_name + " deleted successfully!");
                        break;

                    case 5:
                        System.out.println("Enter the name of the Table to update:");
                        String update_table_name = obj.nextLine();

                        System.out.println("Enter the column name to update:");
                        String update_column = obj.nextLine();

                        System.out.println("Enter the new value:");
                        String new_value = obj.nextLine();

                        System.out.println("Enter the condition (e.g., id = 1):");
                        String condition = obj.nextLine();

                        String updateQuery = "UPDATE " + update_table_name + " SET " + update_column + " = '" + new_value + "' WHERE " + condition;
                        stmt.executeUpdate(updateQuery);
                        System.out.println("Table " + update_table_name + " updated successfully!");
                        break;

                    case 6:
                        System.out.println("Enter the name of the Table to insert data into:");
                        String insert_table_name = obj.nextLine();

                        String countQuery = "SELECT * FROM " + insert_table_name + " LIMIT 1";
                        ResultSet rs = stmt.executeQuery(countQuery);
                        ResultSetMetaData rsMetaData = rs.getMetaData();

                        int columnCount = rsMetaData.getColumnCount();
                        StringBuilder insertQuery = new StringBuilder("INSERT INTO " + insert_table_name + " VALUES (");

                        for (int i = 1; i <= columnCount; i++) {
                            System.out.println("Enter the value for column " + rsMetaData.getColumnName(i) + ":");
                            String value = obj.nextLine();

                            insertQuery.append("'").append(value).append("'");

                            if (i < columnCount) {
                                insertQuery.append(", ");
                            }
                        }

                        insertQuery.append(")");
                        stmt.executeUpdate(insertQuery.toString());
                        System.out.println("Data inserted into table " + insert_table_name + " successfully!");
                        break;

                   /* case 6:
                        System.out.println("Enter the name of the Table to insert data into:");
                        String insert_table_name = obj.nextLine();

                        String countQuery = "SELECT * FROM " + insert_table_name + " LIMIT 1";
                        ResultSet rs = stmt.executeQuery(countQuery);
                        ResultSetMetaData rsMetaData = rs.getMetaData();

                        int columnCount = rsMetaData.getColumnCount();

                        StringBuilder insertQuery = new StringBuilder("INSERT INTO " + insert_table_name + " VALUES (");
                        for (int i = 1; i <= columnCount; i++) {
                            insertQuery.append("?");
                            if (i < columnCount) {
                                insertQuery.append(", ");
                            }
                        }
                        insertQuery.append(")");

                        PreparedStatement pstmtInsert = connection.prepareStatement(insertQuery.toString());

                        // Get values for each column
                        for (int i = 1; i <= columnCount; i++) {
                            System.out.println("Enter the value for column " + rsMetaData.getColumnName(i) + ":");
                            String value = obj.nextLine();
                            pstmtInsert.setString(i, value);
                        }

                        pstmtInsert.executeUpdate();
                        System.out.println("Data inserted into table " + insert_table_name + " successfully!");
                        break;*/

                    default:
                        System.out.println("Invalid option selected.");
                }

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        obj.close();
    }

    public static void main(String[] args) {
        CRUD crud = new CRUD();
        crud.crud_operations();
    }
}
