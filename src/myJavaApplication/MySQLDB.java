// MySQLDB.java
package myJavaApplication;

import java.sql.*;
import java.util.ArrayList;

public class MySQLDB {

    Connection con;
    Statement stmt;
    ResultSet rs;

    public Connection connect() {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "123456";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (Exception e) {
            System.out.println("ERROR : Cannot get a connection");
            System.out.println("ERROR : " + e);
            return null;
        }
    }

    public int stmtCreInsUpdDel(String sql) {
        int row = 0;
        try {
            con = connect();
            stmt = con.createStatement();
            row = stmt.executeUpdate(sql);
            return row;
        } catch (Exception e) {
            System.out.println("ERROR : Cannot execute query");
            System.out.println("ERROR : " + e);
            return row;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public ArrayList<StudentInfo> selectQuery(String sql) {
        StudentInfo std;
        try {
            con = connect();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            ArrayList<StudentInfo> studentList = new ArrayList<>();
            while (rs.next()) {
                std = new StudentInfo();
                std.setId(rs.getString(1));
                std.setName(rs.getString(2));
                std.setSurname(rs.getString(3));
                studentList.add(std);
            }
            return studentList;
        } catch (Exception e) {
            System.out.println("ERROR : Cannot get data");
            System.out.println("ERROR : " + e);
            return null;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                } else {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public ResultSet selectQueryData(String sql) {
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            return rs;
        } catch (Exception e) {
            System.out.println("ERROR : Cannot get Data");
            System.out.println("ERROR : " + e);
            return null;
        }
    }
}
