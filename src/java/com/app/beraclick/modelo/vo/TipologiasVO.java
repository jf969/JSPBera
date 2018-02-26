package com.app.beraclick.modelo.vo;
/**
 *
 * @author Julián Flórez
 */
public class TipologiasVO {

    private int idTipologia_PK;
    private String nombreTipologia;
    private String estadoTipologia;
    private int idPais_FK;
    private int idEspecialidad_FK;

    public int getIdTipologia_PK() {
        return idTipologia_PK;
    }

    public void setIdTipologia_PK(int idTipologia_PK) {
        this.idTipologia_PK = idTipologia_PK;
    }

    public String getNombreTipologia() {
        return nombreTipologia;
    }

    public void setNombreTipologia(String nombreTipologia) {
        this.nombreTipologia = nombreTipologia;
    }

    public String getEstadoTipologia() {
        return estadoTipologia;
    }

    public void setEstadoTipologia(String estadoTipologia) {
        this.estadoTipologia = estadoTipologia;
    }

    public int getIdPais_FK() {
        return idPais_FK;
    }

    public void setIdPais_FK(int idPais_FK) {
        this.idPais_FK = idPais_FK;
    }

    public int getIdEspecialidad_FK() {
        return idEspecialidad_FK;
    }

    public void setIdEspecialidad_FK(int idEspecialidad_FK) {
        this.idEspecialidad_FK = idEspecialidad_FK;
    }
    
    
    
    
}
