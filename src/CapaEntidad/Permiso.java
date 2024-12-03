package capaEntidad;

public class Permiso {
    private int idPermiso;
    private Rol objRol; // Referencia a la clase Rol
    private String nombreMenu;
    private String fechaRegistro;

    // Constructor vacío
    public Permiso() {}

    // Constructor con parámetros
    public Permiso(int idPermiso, Rol objRol, String nombreMenu, String fechaRegistro) {
        this.idPermiso = idPermiso;
        this.objRol = objRol;
        this.nombreMenu = nombreMenu;
        this.fechaRegistro = fechaRegistro;
    }

    // Getters y Setters
    public int getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(int idPermiso) {
        this.idPermiso = idPermiso;
    }

    public Rol getObjRol() {
        return objRol;
    }

    public void setObjRol(Rol objRol) {
        this.objRol = objRol;
    }

    public String getNombreMenu() {
        return nombreMenu;
    }

    public void setNombreMenu(String nombreMenu) {
        this.nombreMenu = nombreMenu;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}

