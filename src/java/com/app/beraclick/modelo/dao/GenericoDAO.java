
package com.app.beraclick.modelo.dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Julián Flórez
 */
public interface GenericoDAO <V>{
    
    public void insert(V vo) throws SQLException;
    public void update(V vo) throws SQLException;
    public void delete(V vo) throws SQLException;
    public List <V> findAll() throws SQLException;
    public V findForID(int id) throws SQLException;
   
}
