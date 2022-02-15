
package Clases;

import clases.DetalleCompra;
import java.util.List;


/**
 *
 * @author sergi
 */

public class Compra {
    private int id;
    private char iva;
    private char valorCompra;
    private char descuento;
    private List<DetalleCompra> detalleCompra;
    private char idCliente;
    private char idTienda;
    private char idVendedor;
    private char createdAdd;
    private char updatedAt;
    private char deletedAt;

    public Compra(int id, char iva, char valorCompra, char descuento, List<DetalleCompra> detalleCompra, char idCliente, char idTienda, char idVendedor, char createdAdd, char updatedAt, char deletedAt) {
        this.id = id;
        this.iva = iva;
        this.valorCompra = valorCompra;
        this.descuento = descuento;
        this.detalleCompra = detalleCompra;
        this.idCliente = idCliente;
        this.idTienda = idTienda;
        this.idVendedor = idVendedor;
        this.createdAdd = createdAdd;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public int getID() { return id; }
    public void setID(int value) { this.id = value; }

    public char getIva() { return iva; }
    public void setIva(char value) { this.iva = value; }

    public char getValorCompra() { return valorCompra; }
    public void setValorCompra(char value) { this.valorCompra = value; }

    public char getDescuento() { return descuento; }
    public void setDescuento(char value) { this.descuento = value; }

    public List<DetalleCompra> getDetalleCompra() { return detalleCompra; }
    public void setDetalleCompra(List<DetalleCompra> value) { this.detalleCompra = value; }

    public char getIDCliente() { return idCliente; }
    public void setIDCliente(char value) { this.idCliente = value; }

    public char getIDTienda() { return idTienda; }
    public void setIDTienda(char value) { this.idTienda = value; }

    public char getIDVendedor() { return idVendedor; }
    public void setIDVendedor(char value) { this.idVendedor = value; }

    public char getCreatedAdd() { return createdAdd; }
    public void setCreatedAdd(char value) { this.createdAdd = value; }

    public char getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(char value) { this.updatedAt = value; }

    public char getDeletedAt() { return deletedAt; }
    public void setDeletedAt(char value) { this.deletedAt = value; }
}

