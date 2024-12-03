package capaEntidad;

public class Venta {
    private int idVenta;
    private Usuario objUsuario; // Referencia a la clase Usuario
    private String tipoDocumento;
    private String numeroDocumento;
    private String documentoCliente;
    private String nombreCliente;
    private double montoPago; 
    private double montoCambio;
    private double montoTotal;

    // Constructor vacío
    public Venta() {}

    // Constructor con parámetros
    public Venta(int idVenta, Usuario objUsuario, String tipoDocumento, String numeroDocumento, String documentoCliente, String nombreCliente, double montoPago, double montoCambio, double montoTotal) {
        this.idVenta = idVenta;
        this.objUsuario = objUsuario;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.documentoCliente = documentoCliente;
        this.nombreCliente = nombreCliente;
        this.montoPago = montoPago;
        this.montoCambio = montoCambio;
        this.montoTotal = montoTotal;
    }

    // Getters y Setters
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Usuario getObjUsuario() {
        return objUsuario;
    }

    public void setObjUsuario(Usuario objUsuario) {
        this.objUsuario = objUsuario;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(double montoPago) {
        this.montoPago = montoPago;
    }

    public double getMontoCambio() {
        return montoCambio;
    }

    public void setMontoCambio(double montoCambio) {
        this.montoCambio = montoCambio;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
}

