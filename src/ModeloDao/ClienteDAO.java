/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Conexion.Conexion;
import Interface.CrudCliente;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Javier Pisco
 */
public class ClienteDAO implements CrudCliente{
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public Cliente listarId(String dni){
        Cliente cli=new Cliente();
        String sql="select * from cliente where dni=?";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, dni);
            rs=ps.executeQuery();
            while (rs.next()) {                
                cli.setIdCliente(rs.getInt(1));
                cli.setDni(rs.getInt(2));
                cli.setNombres(rs.getString(3));
                cli.setEstado(rs.getString(4));
            }
        } catch (SQLException e) {
        }
        return cli;
    }

    @Override
    public List listar() {
        List<Cliente> listC = new ArrayList<>();
        String sql = "select * from cliente";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt(1));                
                c.setDni(rs.getInt(2));
                c.setNombres(rs.getString(3));
                c.setEstado(rs.getString(4));
                listC.add(c);
            }
        } catch (SQLException e) {
        }
        return listC;
    }

    @Override
    public int agregarC(Object[] o) {
        int r = 0;
        String sql = "insert into cliente (dni,nombres,estado) values(?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.executeUpdate();
            
        } catch (SQLException e) {
        }
        return r;
    }

    @Override
    public int actualizarC(Object[] o) {
        int r = 0;
        String sql = "update cliente set dni=?,nombres=?,estado=? where idCliente=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }
    
    @Override
    public void eliminarC(int id){
        String sql="delete from cliente where idCliente=?";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
                
    }
}
