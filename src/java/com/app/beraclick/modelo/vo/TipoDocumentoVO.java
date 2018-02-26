
package com.app.beraclick.modelo.vo;
/**
 *
 * @author Julián Flórez
 */
public class TipoDocumentoVO {
    
    private int idTipoDoc_PK;
    private String nombreTipoDoc;

    /*Encapsulamiento*/
    public int getIdTipoDoc_PK() {
        return idTipoDoc_PK;
    }

    public void setIdTipoDoc_PK(int idTipoDoc_PK) {
        this.idTipoDoc_PK = idTipoDoc_PK;
    }

    public String getNombreTipoDoc() {
        return nombreTipoDoc;
    }

    public void setNombreTipoDoc(String nombreTipoDoc) {
        this.nombreTipoDoc = nombreTipoDoc;
    }
    
    

}
