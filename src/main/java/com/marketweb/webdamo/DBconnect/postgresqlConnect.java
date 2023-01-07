package com.marketweb.webdamo.DBconnect;

import java.sql.*;
/**
 * @author bigway2626.huang
 */
public class postgresqlConnect {
    //jdbc:postgresql://<database_host>:<port>/<database_name>
    private ResultSet resultSet = null;
    private final String url = "jdbc:postgresql://localhost/postgres";
    private final String user = "postgres";
    private final String password = "1234";



    public Connection SelectData() {
        Connection conn = null;
        String selectSql = "SELECT * FROM git_command ";
        try {
            conn = DriverManager.getConnection(url, user, password);
            Statement statement = conn.createStatement();
            resultSet = statement.executeQuery(selectSql);
            System.out.println("Connected to the PostgreSQL server successfully.");
            System.out.println(conn);
            // Print results from select statement getString為取得的欄位值
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    public Connection InsertData() {
        //System.out.println(InserSql);
        String InserSql ="INSERT INTO git_command(command,features) VALUES ('git add','新增檔案到git' )";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            Statement statement = conn.createStatement();
            resultSet = statement.executeQuery(InserSql);
            System.out.println("Insert to the PostgreSQL server successfully.");
            // Print results from select statement getString為取得的欄位值
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    public String SelectOneFieldValue(String sql, String fieldName) throws Exception {
        String value = null;
        Connection conn = DriverManager.getConnection(url, user, password);;
        Statement statement = conn.createStatement();


        ResultSet rs = statement.executeQuery(sql.toString());
        while (rs.next()) {
            value = rs.getString(fieldName);
        }
        rs.close();
        statement.close();


        return value;
    }
        /*public static void main(String[] args) throws SQLException {
        postgresqlConnect PgTest = new postgresqlConnect();
        PgTest.InsertData();
       PgTest.SelectData();
    }*/
}

