
package atm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class baglantı {
    
    private Connection conn;
    public Connection baglan(){
        return conn;
    }
    public baglantı () throws SQLException{
        try{
           // conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bankaATM","root","123");
           conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bankamatik","root","123");
        }catch(Exception exp){
            System.out.println("Veri tabanı bağlantısı kurulamadı");
            System.out.println(exp.getMessage());
        }
    }
    
}
