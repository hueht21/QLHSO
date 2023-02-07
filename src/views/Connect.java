package views;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hue_HT21
 */
public class Connect {
    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String hostName = "127.0.0.1";
            String dbName = "HoSoSinhVien";
            String username = "springtest";
            String password = "123456";
//            String url = "jdbc:mariadb://" + hostName + ":3306;database=" + dbName + ";user=" + username + ";password=" + password + ";";
            String url = "jdbc:mariadb://" + hostName + ":3306/" + dbName + "?user=springtest&password=123456";

            con = DriverManager.getConnection(url);
            System.out.println("Connected trưe");

        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        return con;
    }
}