/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Javier Pisco
 */
public class Reportes {
    String Cliente;
    String Vendedor;
    String Fecha;
    double Monto;

    public Reportes() {
    }

    public Reportes(String Cliente, String Vendedor, String Fecha, double Monto) {
        this.Cliente = Cliente;
        this.Vendedor = Vendedor;
        this.Fecha = Fecha;
        this.Monto = Monto;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }
    
}
