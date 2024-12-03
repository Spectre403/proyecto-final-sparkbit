package capaEntidad;

public class DetalleVenta {
    private int idDetalleVenta;
    private Producto objProducto; // Referencia a la clase Producto
    private double precioVenta; 
    private int cantidad;
    private double subTotal;
    private String fechaRegistro;

    // Constructor vacío
    public DetalleVenta() {}

    // Constructor con parámetros
    public DetalleVenta(int idDetalleVenta, Producto objProducto, double precioVenta, int cantidad, double subTotal, String fechaRegistro) {
        this.idDetalleVenta = idDetalleVenta;
        this.objProducto = objProducto;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.fechaRegistro = fechaRegistro;
    }

    // Getters y Setters
    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public Producto getObjProducto() {
        return objProducto;
    }

    public void setObjProducto(Producto objProducto) {
        this.objProducto = objProducto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}

