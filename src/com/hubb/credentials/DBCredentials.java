//3.2.16 20:17 v0.1
package com.hubb.credentials;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Richard Strauss
 */
public class DBCredentials {
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    private final String DB_URL = "jdbc:mysql://localhost/tagger";
    private final String USER = "stefan";
    private final String PASS = "";
      
    public boolean setDBCredentialsData(String name, String email){
        Connection con = null;
        Statement stmt = null;
        boolean isSuccessfully = false;
        try{
            if(name != null && email != null){
                Class.forName(JDBC_DRIVER);
                con = DriverManager.getConnection(DB_URL, USER, PASS);

                PreparedStatement upd = con.prepareStatement("INSERT INTO credentials SET name = ?, email = ?, timestamp = ?");
                upd.setString(1, name);
                upd.setString(2, email);
                upd.setString(3, getCurrentTimeStamp());

                upd.executeUpdate();
                isSuccessfully = true;
            }

        }catch(SQLException | ClassNotFoundException se){
            se.printStackTrace(System.err);
        }finally{
            try{
                if(stmt!=null)
                stmt.close();
            }catch(SQLException exc){}
            try{
                if(con!=null){
                    con.close();
                }
            }catch(SQLException se){}
        }        
        return isSuccessfully;
    }
    
    
    public static String getCurrentTimeStamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date now = new Date();
        String strDate = sdf.format(now);
        return strDate;
    }
}