/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaxmen2p2_gabrielgiron_12051024;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Galex
 */
public class Cientificos implements Serializable{
    private String Nombre;
    private ArrayList<Planetas> Descubiertos = new ArrayList();

    public Cientificos(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Planetas> getDescubiertos() {
        return Descubiertos;
    }

    public void setDescubiertos(ArrayList<Planetas> Descubiertos) {
        this.Descubiertos = Descubiertos;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
}
