
package Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexao {
    
    private static final String URL ="jdbc:mysql://localhost:3306/farmex";
    private static final String USER="root";
    private static final String PASS="058787";
    Connection conn;
    
    
    
    public static Connection conectar(){
        try{
            return DriverManager.getConnection(URL,USER,PASS);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro na conexão: " + e.getMessage());
            return null;
        }}
    public void desconectar(){
      try{
        
        conn.close();
      }catch(SQLException ex){
         
      }}
        
        
            
    
    
    
    }
    
    

