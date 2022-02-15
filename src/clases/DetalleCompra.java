package clases;

/**
 *
 * @author sergi
 */
public class DetalleCompra {
    private long id;
    private int compraID;
    private int cantidad;
    private int idProducto;

    public DetalleCompra(long id, int compraID, int cantidad, int idProducto) {
        this.id = id;
        this.compraID = compraID;
        this.cantidad = cantidad;
        this.idProducto = idProducto;
    }

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public int getCompraID() { return compraID; }
    public void setCompraID(int value) { this.compraID = value; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int value) { this.cantidad = value; }

    public int getIDProducto() { return idProducto; }
    public void setIDProducto(int value) { this.idProducto = value; }
}
