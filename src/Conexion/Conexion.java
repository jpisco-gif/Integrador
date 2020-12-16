/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Javier Pisco
 */
public class Conexion {

    Connection con;
    String conexionMysql = "com.mysql.jdbc.Driver";
    String urlMysql = "jdbc:mysql://localhost:3306/bdfarmacia?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
    String userMysql = "root";
    String passMysql = "Peruano2020";

    public Connection getConnection() {
        try {
            Class.forName(conexionMysql);
            con = DriverManager.getConnection(urlMysql, userMysql, passMysql);
        } catch (Exception e) {
            System.err.println("Error:" + e);
        }
        return con;
    }
}
