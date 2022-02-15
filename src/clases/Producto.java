/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author sergi
 */
public class Producto {

    private int id;
    private char nombre;
    private double precio;
    private int idCategoria;
    private char gatrantia;
    private double iva;

    public Producto(int id, char nombre, double precio, int idCategoria, char gatrantia, double iva) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.idCategoria = idCategoria;
        this.gatrantia = gatrantia;
        this.iva = iva;
    }

    public int getID() { return id; }
    public void setID(int value) { this.id = value; }

    public char getNombre() { return nombre; }
    public void setNombre(char value) { this.nombre = value; }

    public double getPrecio() { return precio; }
    public void setPrecio(double value) { this.precio = value; }

    public int getIDCategoria() { return idCategoria; }
    public void setIDCategoria(int value) { this.idCategoria = value; }

    public char getGatrantia() { return gatrantia; }
    public void setGatrantia(char value) { this.gatrantia = value; }

    public double getIva() { return iva; }
    public void setIva(double value) { this.iva = value; }


}
