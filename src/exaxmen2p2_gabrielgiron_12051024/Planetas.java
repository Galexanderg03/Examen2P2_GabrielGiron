/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaxmen2p2_gabrielgiron_12051024;

/**
 *
 * @author Galex
 */
public class Planetas {
    private int Tamaño;
    private int Peso;
    private String Nombre;
    private int x;
    private int y;

    public Planetas(int Tamaño, int Peso, String Nombre, int x, int y) {
        this.Tamaño = Tamaño;
        this.Peso = Peso;
        this.Nombre = Nombre;
        this.x = x;
        this.y = y;
    }

    public int getTamaño() {
        return Tamaño;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
}
