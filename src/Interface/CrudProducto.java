/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.Producto;

/**
 *
 * @author Javier Pisco
 */
public interface CrudProducto {
    public int ActualizarStock(int cant, int ip);
    public Producto listarId(int codigo);
}
