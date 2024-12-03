package capaEntidad;

public class DetalleCompra {
    private int idDetalleCompra;
    private Producto objProducto; // Referencia a la clase Producto
    private double precioCompra; 
    private double precioVenta;
    private int cantidad;
    private double montoTotal;
    private String fechaRegistro;

    // Constructor vacío
    public DetalleCompra() {}

    // Constructor con parámetros
    public DetalleCompra(int idDetalleCompra, Producto objProducto, double precioCompra, double precioVenta, int cantidad, double montoTotal, String fechaRegistro) {
        this.idDetalleCompra = idDetalleCompra;
        this.objProducto = objProducto;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.montoTotal = montoTotal;
        this.fechaRegistro = fechaRegistro;
    }

    // Getters y Setters
    public int getIdDetalleCompra() {
        return idDetalleCompra;
    }

    public void setIdDetalleCompra(int idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public Producto getObjProducto() {
        return objProducto;
    }

    public void setObjProducto(Producto objProducto) {
        this.objProducto = objProducto;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
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

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}

