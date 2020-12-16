/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Conexion.Conexion;
import Interface.CrudVenta;
import Modelo.DetalleVentas;
import Modelo.Ventas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Pisco
 */
public class VentasDAO implements CrudVenta{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r = 0;
    
//    public void Imprimir(int parametr){       
//        try {
//            JasperReport reporte=null;
//            String path="src//Reportes//ReportVenta.jasper";
//            
//            Map parametro=new HashMap();
//            parametro.put("idVentas",41);
//            reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
//            JasperPrint jprint =JasperFillManager.fillReport(path,parametro,con);
//            JasperViewer view=new JasperViewer(jprint, false);
//            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//            view.setVisible(true);
//        } catch (JRException ex) {
//            Logger.getLogger(VentasDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        
//    }

    @Override
    public String NroSerieVentas() {
        String serie = "";
        String sql = "select max(NumeroSerie) from ventas";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                serie = rs.getString(1);
            }
        } catch (SQLException e) {
        }
        return serie;
    }

    @Override
    public String IdVentas() {
        String idv = "";
        String sql = "Select max(idVenta) from ventas";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                idv = rs.getString(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return idv;
    }

    @Override
    public int GuardarVenta(Ventas v) {
        Ventas vent = new Ventas();
        String sql = "insert into ventas(NumeroSerie,idCliente,idCuenta,fechaVenta,monto,estado) values (?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, v.getNumeroSerie());
            ps.setInt(2, v.getIdCliente());
            ps.setInt(3, v.getIdCuenta());
            ps.setString(4, v.getFechaVenta());
            ps.setDouble(5, v.getMonto());
            ps.setString(6, v.getEstado());
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }

    @Override
    public int GuardarDetalleVenta(DetalleVentas dv) {
        String sql = "insert into detalle_ventas(idVenta,idProducto,cantidad,precioVenta) values (?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dv.getIdVenta());
            ps.setInt(2, dv.getIdProducto());
            ps.setInt(3, dv.getCant());
            ps.setDouble(4, dv.getPrecioVenta());
            r = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }
}
