/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimientoventas;

import java.util.Date;


public class Factura {
    private Date fecha;
    private Vendedor vendedor;
    private Venta venta;
    private FormaPago formaPago;

    public Factura(Date fecha, Vendedor vendedor, Venta venta, FormaPago formaPago) {
        this.fecha = fecha;
        this.vendedor = vendedor;
        this.venta = venta;
        this.formaPago = formaPago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Factura{" + "fecha=" + fecha + ", vendedor=" + vendedor + ", venta=" + venta + ", formaPago=" + formaPago + '}';
    }
}


   