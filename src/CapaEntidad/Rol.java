package capaEntidad;

public class Rol {
    private int idRol;
    private String descripcion;
    private String fechaRegistro;

    // Constructor vacío
    public Rol() {}

    // Constructor con parámetros
    public Rol(int idRol, String descripcion, String fechaRegistro) {
        this.idRol = idRol;
        this.descripcion = descripcion;
        this.fechaRegistro = fechaRegistro;
    }

    // Getters y Setters
    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}

