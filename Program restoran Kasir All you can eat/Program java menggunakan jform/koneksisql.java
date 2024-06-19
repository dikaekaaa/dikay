/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasirkemaren;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
/**
 *
 * @author oitco
 */
public class koneksisql {
    private String url="jdbc:mysql://localhost/db_restoran";
    private String username_xampp = "root";
    private String password_xampp = "";
    private Connection con;
    
    public void connect(){
        try {
            con = DriverManager.getConnection(url, username_xampp, password_xampp);
            System.out.println("berhasil men");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public Connection getCon(){
        return con;
    }
    
}
