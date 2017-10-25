/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alak.holamundo;

import java.util.Date;

/**
 *
 * @author Bethox
 */
public class principal {

    private String nombre;
    private Date fecha;

    public static void main(String[] args) {
        System.out.println("Hola mundo");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
