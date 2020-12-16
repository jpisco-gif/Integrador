/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.DetalleVentas;
import Modelo.Ventas;

/**
 *
 * @author Javier Pisco
 */
public interface CrudVenta {
   public String NroSerieVentas() ;
    public String IdVentas() ;
    public int GuardarVenta(Ventas v) ;
    public int GuardarDetalleVenta(DetalleVentas dv);
}
