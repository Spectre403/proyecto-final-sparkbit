package capaEntidad;

public class Categoria {
    private int idCategoria;
    private String descripcion;
    private boolean estado;
    private String fechaRegistro;

    // Constructor vacío
    public Categoria() {}

    // Constructor con parámetros
    public Categoria(int idCategoria, String descripcion, boolean estado, String fechaRegistro) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
    }

    // Getters y Setters
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

