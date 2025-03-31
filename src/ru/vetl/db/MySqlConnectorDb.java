package ru.vetl.db;

import ru.vetl.properties.FilePropertiesReader;

import java.sql.*;
import java.util.Map;

public class MySqlConnectorDb implements IDatabase{

    private static Connection connection = null;
    private static Statement statement = null;


    private String url = "jdbc:mysql://localhost:3306/";
    private String login = System.getProperty("login");
    private String password = System.getProperty("password");



    //подключение к БД
    private void openConnectToDb() throws SQLException {
        if (connection == null) {
            Map<String, String> settings = new FilePropertiesReader().getSettings();
            connection = DriverManager.getConnection("", "", "");
        }

        if (statement == null) {
            statement = connection.createStatement();
        }

        Connection connection = DriverManager.getConnection("","","");
        statement = connection.createStatement();
    }

    public void requestExecute(String sqlRequest) throws SQLException {
    statement.execute(sqlRequest);
    }


    public ResultSet requestExecuteWithReturned(String sqlQuery) throws SQLException {
        openConnectToDb();
        return statement.executeQuery(sqlQuery);
    }

    public void close() throws SQLException {
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }
}
