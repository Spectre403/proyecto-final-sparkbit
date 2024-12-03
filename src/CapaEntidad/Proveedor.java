package capaEntidad;

public class Proveedor {
    private int idProveedor;
    private String documento;
    private String razonSocial;
    private String correo;
    private String telefono;
    private boolean estado;
    private String fechaRegistro;

    // Constructor vacío
    public Proveedor() {}

    // Constructor con parámetros
    public Proveedor(int idProveedor, String documento, String razonSocial, String correo, String telefono, boolean estado, String fechaRegistro) {
        this.idProveedor = idProveedor;
        this.documento = documento;
        this.razonSocial = razonSocial;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
    }

    // Getters y Setters
    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}

