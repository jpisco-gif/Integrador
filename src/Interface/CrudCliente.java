/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.Cliente;
import java.util.List;

/**
 *
 * @author Javier Pisco
 */
public interface CrudCliente {
  public Cliente listarId(String dni);

    public List listar() ;

    public int agregarC(Object[] o) ;

    public int actualizarC(Object[] o) ;
    
    public void eliminarC(int id);
}
