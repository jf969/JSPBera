/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.beraclick.modelo.dao;

import com.app.beraclick.modelo.vo.TipologiasVO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Julián Flórez
 */
public class TipologiasDAO implements GenericoDAO<TipologiasVO>{
    
    private Connection cnn;
    
    public TipologiasDAO(Connection cnn){
        this.cnn = cnn;
    }

    @Override
    public void insert(TipologiasVO vo) throws SQLException {
        
        CallableStatement callProc = cnn.prepareCall("{call insertarTipo(?,?,?,?)}");
        
        callProc.setString(1, vo.getNombreTipologia());
        callProc.setString(2, vo.getEstadoTipologia());
        callProc.setInt(3, vo.getIdPais_FK());
        callProc.setInt(4, vo.getIdEspecialidad_FK());
        
        callProc.executeQuery();
    }

    @Override
    public void update(TipologiasVO vo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(TipologiasVO vo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipologiasVO> findAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TipologiasVO findForID(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
