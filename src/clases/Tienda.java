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
public class Tienda {

    private int id;
    private char nombre;
    private char nit;
    private char email;
    private char telefono;
    private char direccion;

    public Tienda(int id, char nombre, char nit, char email, char telefono, char direccion) {
        this.id = id;
        this.nombre = nombre;
        this.nit = nit;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    public int getID() { return id; }
    public void setID(int value) { this.id = value; }

    public char getNombre() { return nombre; }
    public void setNombre(char value) { this.nombre = value; }

    public char getNit() { return nit; }
    public void setNit(char value) { this.nit = value; }

    public char getEmail() { return email; }
    public void setEmail(char value) { this.email = value; }

    public char getTelefono() { return telefono; }
    public void setTelefono(char value) { this.telefono = value; }

    public char getDireccion() { return direccion; }
    public void setDireccion(char value) { this.direccion = value; }

 
}
