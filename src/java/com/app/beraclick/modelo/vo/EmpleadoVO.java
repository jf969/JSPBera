package com.app.beraclick.modelo.vo;

/**
 *
 * @author Julián Flórez
 */
public class EmpleadoVO {

    private int idEmpleado_PK;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String cargo;
    private String usuario;
    private String clave;
    private String numeroDocumento;
    private int idTipoDocumento_FK;
    private int idRol_FK;
    private int idEspecialidad_FK;
    private String estado;

    public int getIdEmpleado_PK() {
        return idEmpleado_PK;
    }

    public void setIdEmpleado_PK(int idEmpleado_PK) {
        this.idEmpleado_PK = idEmpleado_PK;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getIdTipoDocumento_FK() {
        return idTipoDocumento_FK;
    }

    public void setIdTipoDocumento_FK(int idTipoDocumento_FK) {
        this.idTipoDocumento_FK = idTipoDocumento_FK;
    }

    public int getIdRol_FK() {
        return idRol_FK;
    }

    public void setIdRol_FK(int idRol_FK) {
        this.idRol_FK = idRol_FK;
    }

    public int getIdEspecialidad_FK() {
        return idEspecialidad_FK;
    }

    public void setIdEspecialidad_FK(int idEspecialidad_FK) {
        this.idEspecialidad_FK = idEspecialidad_FK;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    private String correo;

}
