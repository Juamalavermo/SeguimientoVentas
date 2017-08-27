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
public class Fecha {
   private int dia;
   private int mes;
   private int anio;
   private String hora;

    public Fecha(int dia, int mes, int anio, String hora) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.hora = hora;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", año=" + anio + ", hora=" + hora + '}';
    }
   
   
}
