
package com.app.beraclick.modelo.vo;

import java.util.Date;

/**
 *
 * @author Julián Flórez
 */
public class EstadoIncidenciaVO {
    
    private int idEstadoIncidencia_PK;
    private String nombreEstado;
    private Date fechaEstado;
    private String comentarioEstado;

    public int getIdEstadoIncidencia_PK() {
        return idEstadoIncidencia_PK;
    }

    public void setIdEstadoIncidencia_PK(int idEstadoIncidencia_PK) {
        this.idEstadoIncidencia_PK = idEstadoIncidencia_PK;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public Date getFechaEstado() {
        return fechaEstado;
    }

    public void setFechaEstado(Date fechaEstado) {
        this.fechaEstado = fechaEstado;
    }

    public String getComentarioEstado() {
        return comentarioEstado;
    }

    public void setComentarioEstado(String comentarioEstado) {
        this.comentarioEstado = comentarioEstado;
    }
    
    

}
