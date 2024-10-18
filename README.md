# Java JDBC Learning

This branch is dedicated to learning JDBC (Java Database Connectivity), which allows Java applications to interact with databases using SQL.

## Topics Covered

- **Connecting to a Database**: Using JDBC to connect to relational databases (e.g., MySQL, PostgreSQL).
- **Executing Queries**: Performing SQL operations (INSERT, SELECT, UPDATE, DELETE) through Java.
- **PreparedStatement and Statement**: Safe and efficient SQL query execution.
- **Transaction Management**: Committing and rolling back transactions.
- **ResultSet**: Retrieving and processing data from queries.

## Key Concepts

1. **Database Connection**: Learn how to establish a connection to a MySQL database using JDBC drivers.
2. **CRUD Operations**: Implement Create, Read, Update, and Delete operations using JDBC.
3. **Prepared Statements**: Safely execute SQL queries with dynamic parameters to avoid SQL injection.
4. **Transaction Management**: Manage database transactions, including committing and rolling back operations.

## Code Examples

- `JdbcConnectionExample.java`: Demonstrates how to connect to a MySQL database.
- `PreparedStatementExample.java`: Shows how to use `PreparedStatement` for parameterized SQL queries.
- `TransactionManagement.java`: Explains how to manage transactions using JDBC.

## Learning Goals

- Understand how to use JDBC to connect to databases and perform CRUD operations.
- Learn how to use `PreparedStatement` to prevent SQL injection attacks.
- Master transaction management to ensure data consistency and reliability.

## How to Run the Code

1. Clone the repository.
2. Navigate to the `learning/jdbc` branch.
3. Ensure you have a running database (e.g., MySQL) and update the database credentials in the code.
4. Compile and run the Java files using your IDE or the command line.

