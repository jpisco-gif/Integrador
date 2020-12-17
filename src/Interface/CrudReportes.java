/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.List;

/**
 *
 * @author Javier Pisco
 */
public interface CrudReportes {
    public List listartotalMes();
    public List listarMes(String mes);
    public List listarCuenta(String cuenta);
}
