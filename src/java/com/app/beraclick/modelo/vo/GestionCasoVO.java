
package com.app.beraclick.modelo.vo;

import java.util.Date;

/**
 *
 * @author Julián Flórez
 */
public class GestionCasoVO {
    
    private int idGestionCaso_PK;
    private int numeroCaso;
    private Date fechaEntrada;
    private int devoluciones;
    private int idEmpleado_FK;
    private int idEstadoIncidencia_FK;
    private int idTipologia_FK;

    public int getIdGestionCaso_PK() {
        return idGestionCaso_PK;
    }

    public void setIdGestionCaso_PK(int idGestionCaso_PK) {
        this.idGestionCaso_PK = idGestionCaso_PK;
    }

    public int getNumeroCaso() {
        return numeroCaso;
    }

    public void setNumeroCaso(int numeroCaso) {
        this.numeroCaso = numeroCaso;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int getDevoluciones() {
        return devoluciones;
    }

    public void setDevoluciones(int devoluciones) {
        this.devoluciones = devoluciones;
    }

    public int getIdEmpleado_FK() {
        return idEmpleado_FK;
    }

    public void setIdEmpleado_FK(int idEmpleado_FK) {
        this.idEmpleado_FK = idEmpleado_FK;
    }

    public int getIdEstadoIncidencia_FK() {
        return idEstadoIncidencia_FK;
    }

    public void setIdEstadoIncidencia_FK(int idEstadoIncidencia_FK) {
        this.idEstadoIncidencia_FK = idEstadoIncidencia_FK;
    }

    public int getIdTipologia_FK() {
        return idTipologia_FK;
    }

    public void setIdTipologia_FK(int idTipologia_FK) {
        this.idTipologia_FK = idTipologia_FK;
    }
    
    

}
