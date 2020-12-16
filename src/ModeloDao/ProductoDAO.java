/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Conexion.Conexion;
import Interface.CrudProducto;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Javier Pisco
 */
public class ProductoDAO implements CrudProducto{
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    @Override
    public int ActualizarStock(int cant, int ip){
        String sql="update producto set stock=? where idProducto=?";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setInt(2, ip);
            r=ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }
    @Override
    public Producto listarId(int codigo){
        Producto pr=new Producto();
        String sql="select * from producto where codBarras=?";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs=ps.executeQuery();
            while (rs.next()) {                
                pr.setIdProducto(rs.getInt(1));
                pr.setIdCategoria(rs.getInt(2));
                pr.setIdProveedor(rs.getInt(3));
                pr.setCodBarras(rs.getInt(4));
                pr.setNombre(rs.getString(5));
                pr.setPrecioCompra(rs.getDouble(6));
                pr.setPrecioVenta(rs.getDouble(7));
                pr.setFechaCaduc(rs.getString(8));
                pr.setStock(rs.getInt(9));
                pr.setEstado(rs.getString(10));
            }
        } catch (SQLException e) {
        }
        return pr;
    }
}
