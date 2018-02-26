
package com.app.beraclick.modelo.dao;

import com.app.beraclick.modelo.vo.EmpleadoVO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Julián Flórez
 */
public class EmpleadoDAO implements GenericoDAO<EmpleadoVO>{
    
    private Connection cnn;
    
    
    public EmpleadoDAO(Connection cnn){
        this.cnn = cnn;
    }

    @Override
    public void insert(EmpleadoVO vo) throws SQLException {
        
        CallableStatement callProc = cnn.prepareCall("{call insertarUsuario(?,?,?,?,"
                + "?,?,?,?,?,?,?,?,?)}");
        
        callProc.setString(1, vo.getNombre1());
        callProc.setString(2, vo.getNombre2());
        callProc.setString(3, vo.getApellido1());
        callProc.setString(4, vo.getApellido2());
        callProc.setString(5, vo.getCargo());
        callProc.setString(6, vo.getUsuario());
        callProc.setString(7, vo.getClave());
        callProc.setString(8, vo.getNumeroDocumento());
        callProc.setInt(9, vo.getIdTipoDocumento_FK());
        callProc.setInt(10, vo.getIdRol_FK());
        callProc.setInt(11, vo.getIdEspecialidad_FK());
        callProc.setString(12, vo.getEstado());
        callProc.setString(13, vo.getCorreo());
        
        callProc.executeUpdate();
        
        
    }

    @Override
    public void update(EmpleadoVO vo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(EmpleadoVO vo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EmpleadoVO> findAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EmpleadoVO findForID(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
