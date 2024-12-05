package capaEntidad;

public class Usuario {
    private int idUsuario;
    private String documento;
    private String nombreCompleto;
    private String correo;
    private String clave;
    private int IdRol;
    private Rol objRol; // Referencia a la clase Rol

    // Constructor vacío
    public Usuario() {}

    // Constructor con parámetros
    public Usuario(int idUsuario, String documento, String nombreCompleto, String correo, String clave, int IdRol, Rol objRol) {
        this.idUsuario = idUsuario;
        this.documento = documento;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.clave = clave;
        this.IdRol = IdRol;
        this.objRol = objRol;  
    }

    // Getters y Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Rol getObjRol() {
        return objRol;
    }

    public void setObjRol(Rol objRol) {
        this.objRol = objRol;
        
    }

    public int getIdRol() {
        return IdRol;
    }

    public void setIdRol(int IdRol) {
        this.IdRol = IdRol;
    }
}

