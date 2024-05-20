/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopprojek;

/**
 *
 * @author amsal
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class koneksi {
    public static Connection con;
    public static Statement stm;

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost/projekoop";
            String user = "root"; 
            String pass = "";
            Class.forName("com.mysql.cj.jdbc.Driver"); // Ganti com.mysql.jdbc.Driver menjadi com.mysql.cj.jdbc.Driver
            con = DriverManager.getConnection(url, user, pass);
            stm = con.createStatement();
            System.out.println("Koneksi berhasil");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Koneksi gagal: " + e.getMessage());
        }
    }
}

