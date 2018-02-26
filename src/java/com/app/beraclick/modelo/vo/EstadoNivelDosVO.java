
package com.app.beraclick.modelo.vo;

import java.util.Date;

/**
 *
 * @author Julián Flórez
 */
public class EstadoNivelDosVO {

    private int idEstadoN2_PK;
    private String estado;
    private Date fechaEstadoN2;

    public int getIdEstadoN2_PK() {
        return idEstadoN2_PK;
    }

    public void setIdEstadoN2_PK(int idEstadoN2_PK) {
        this.idEstadoN2_PK = idEstadoN2_PK;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaEstadoN2() {
        return fechaEstadoN2;
    }

    public void setFechaEstadoN2(Date fechaEstadoN2) {
        this.fechaEstadoN2 = fechaEstadoN2;
    }
    
    
}
