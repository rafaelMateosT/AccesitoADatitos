
package Clases;

import com.sun.corba.se.spi.orbutil.fsm.Guard;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rmateos
 */
public class ConecBD {
    
     public Connection iniciarConex(String nombreBD){
        
        Connection conex = null;
        String url = " ";
        url="jdbc:sqlserver://localhost;databaseName="+nombreBD+";user=pepito;password=qq;";
        
        try{
        
            conex = DriverManager.getConnection(url);
            
        }catch(SQLException e){
        
            e.printStackTrace();
        }
        
        return conex;

    } 
     
      public static void cerrar (ResultSet rs) {
          
        try{
            
            rs.close();
            
        }catch (SQLException e){
            
            e.printStackTrace();
        }
    }
    public static void cerrar ( Statement st ) {
        try{
            
            st.close();
            
        }catch (SQLException e){
            
            e.printStackTrace();
        }
    }
    public static void cerrar (Connection con) {
        try{
            
            con.close();
            
        }catch (SQLException e){
            
            e.printStackTrace();
        }
    }
}
