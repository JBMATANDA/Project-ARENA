/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author S153977
 */
public class UserDatabase {
    private UserDatabase(){}
    
    public static boolean getUser(String name)
    {
        try
        {   
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://hitsql-db.hb.se:56077;database=dbtht1629;user=dbtht1629;password=hiss99");
            Statement statement = connection.createStatement();
            String getUser = "select userName from arenaUser where userName = '" + name+ "'";
            ResultSet resultSet = statement.executeQuery(getUser);
            
            while (resultSet.next())
            {
                if (resultSet.getString(1).matches(name))
                {
                    return true;
                }   
            }
        }
        catch(SQLException ex)
        {
                System.out.print(ex.getMessage());
        }
          
        return false;
    }
    public static String getPassword(String name)
    {
       String password = "";
       try
        {   
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://hitsql-db.hb.se:56077;database=dbtht1629;user=dbtht1629;password=hiss99");
            Statement statement = connection.createStatement();
            String getUser = "select userPassword from arenaUser where userName = '" + name+ "'";
            ResultSet resultSet = statement.executeQuery(getUser);
            while (resultSet.next())
            {
                password = resultSet.getString(1);
                return (password);       
            }
        }
        catch(SQLException ex)
        {
                System.out.print(ex.getMessage());
        }
        return password; 
    }
    public static int getUserType(String name)
    {
        try
        {   
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://hitsql-db.hb.se:56077;database=dbtht1629;user=dbtht1629;password=hiss99");
            Statement statement = connection.createStatement();
            String getUser = "select userType from arenaUser where userName = '" + name+ "'";
            ResultSet resultSet = statement.executeQuery(getUser);
            while (resultSet.next())
            {
                String userType = resultSet.getString(1);
                return (parseInt(userType));       
            }
        }
        catch(SQLException ex)
        {
                System.out.print(ex.getMessage());
        }
        return -1; 
    }
}