package CapaNegocio;

import CapaDatos.*;
import capaEntidad.*;
import java.util.List;

public class CnUsuario {
    private final CdUsuario objCdUsuario = new CdUsuario();

    public List<Usuario> Listar() {
        return objCdUsuario.listar();
    }
}
