/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Conexion.Conexion;
import java.sql.Connection;
import Interface.CrudReportes;
import Modelo.Reportes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Javier Pisco
 */
public class ReportesDao implements CrudReportes{
    Connection con;
Conexion cn=new Conexion();
ResultSet rs;
PreparedStatement ps;

    @Override
    public List listarMes(String Mes) {
       List<Reportes> listC = new ArrayList<>();
        String sql = "SELECT b.nombres as 'Cliente', c.nombre as 'Vendedor',fechaVenta, monto  FROM ventas AS a inner join cliente as b ON a.idCliente=b.idCliente INNER JOIN cuenta as c on a.idCuenta=c.idCuenta WHERE (SELECT monthname(fechaVenta))=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Mes);
            rs = ps.executeQuery();
            while (rs.next()) {
                Reportes c = new Reportes();
                c.setCliente(rs.getString(1));                
                c.setVendedor(rs.getString(2));
                c.setFecha(rs.getString(3));
                c.setMonto(rs.getDouble(4));
//                System.out.println(rs.gett);
                listC.add(c);
            }
        } catch (SQLException e) {
        }
        return listC;
    }

    @Override
    public List listarCuenta(String cuenta) {
        List<Reportes> listC = new ArrayList<>();
        String sql = "SELECT monthname(fechaVenta),c.user, sum(monto) FROM ventas AS a INNER JOIN cuenta as c on a.idCuenta=c.idCuenta WHERE c.user=? GROUP BY MONTHNAME(fechaVenta) ORDER by `fechaVenta` ASC";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,cuenta);
            rs = ps.executeQuery();
            while (rs.next()) {
                Reportes c = new Reportes();
                c.setFecha(rs.getString(1));                
                c.setVendedor(rs.getString(2));
                c.setMonto(rs.getDouble(3));
//                c.setMonto(rs.getDouble(4));
//                System.out.println(rs.gett);
                listC.add(c);
            }
        } catch (SQLException e) {
        }
        return listC;
    }

    @Override
    public List listartotalMes() {
        List<Reportes> listC = new ArrayList<>();
        String sql = "SELECT monthname(fechaVenta) As mes, sum(monto) as venta FROM ventas AS a inner join cliente as b ON a.idCliente=b.idCliente INNER JOIN cuenta as c on a.idCuenta=c.idCuenta GROUP BY MONTHNAME(fechaVenta) ORDER by `fechaVenta` ASC";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Reportes c = new Reportes();
//                c.setCliente(rs.getString(1));                
//                c.setVendedor(rs.getString(2));
                c.setFecha(rs.getString(1));
                c.setMonto(rs.getDouble(2));
//                System.out.println(rs.gett);
                listC.add(c);
            }
        } catch (SQLException e) {
        }
        return listC;
    }
    
}
