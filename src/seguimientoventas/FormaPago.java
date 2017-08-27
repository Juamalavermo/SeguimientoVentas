/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimientoventas;

/**
 *
 * @author Julian
 */

public class FormaPago {

private String efectivo;
private String debito;
private String credito;

    public FormaPago(String efectivo, String debito, String credito) {
        this.efectivo = efectivo;
        this.debito = debito;
        this.credito = credito;
    }

    public String getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(String efectivo) {
        this.efectivo = efectivo;
    }

    public String getDebito() {
        return debito;
    }

    public void setDebito(String debito) {
        this.debito = debito;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "FormaPago{" + "efectivo=" + efectivo + ", debito=" + debito + ", credito=" + credito + '}';
    }

}
    
   