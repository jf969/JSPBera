
package com.app.beraclick.modelo.vo;

import java.util.Date;

/**
 *
 * @author Julián Flórez
 */
public class IncidenciaNivelDosVO {
    
    private int idIncidenciaN2_PK;
    private Date fechaCreacion;
    private int numeroIncidencia;
    private int idGestionCasos_FK;
    private int idEstadoN2_FK;
    private int idGrupoN2_FK;

    public int getIdIncidenciaN2_PK() {
        return idIncidenciaN2_PK;
    }

    public void setIdIncidenciaN2_PK(int idIncidenciaN2_PK) {
        this.idIncidenciaN2_PK = idIncidenciaN2_PK;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getNumeroIncidencia() {
        return numeroIncidencia;
    }

    public void setNumeroIncidencia(int numeroIncidencia) {
        this.numeroIncidencia = numeroIncidencia;
    }

    public int getIdGestionCasos_FK() {
        return idGestionCasos_FK;
    }

    public void setIdGestionCasos_FK(int idGestionCasos_FK) {
        this.idGestionCasos_FK = idGestionCasos_FK;
    }

    public int getIdEstadoN2_FK() {
        return idEstadoN2_FK;
    }

    public void setIdEstadoN2_FK(int idEstadoN2_FK) {
        this.idEstadoN2_FK = idEstadoN2_FK;
    }

    public int getIdGrupoN2_FK() {
        return idGrupoN2_FK;
    }

    public void setIdGrupoN2_FK(int idGrupoN2_FK) {
        this.idGrupoN2_FK = idGrupoN2_FK;
    }
    
    

}
