
package com.app.beraclick.controlador;

import com.app.beraclick.modelo.dao.GenericoDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Julián Flórez
 */
public class ControlGenerico <E extends GenericoDAO<T>,T> {
    
    E dao;
    
    public void insertar(T vo){
        try{
            dao.insert(vo);
        }catch(SQLException e){
            System.out.println("Error: " +e.getMessage());
            e.printStackTrace();
        }
    }
        public void borrar(T vo){
            try{
                dao.delete(vo);
            }catch(SQLException e){
                System.out.println("Error: "+e.getMessage());
                e.printStackTrace();
            }
        }
        
        public void editar(T vo){
            try{
               dao.update(vo);
               
            }catch(SQLException e){
                System.out.println("Error: "+e.getMessage());
                e.printStackTrace();
            }
    }
        public List<T> consultar(){
            try{
                return dao.findAll();
            }catch(SQLException e){
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
                return null;
            }
            
        }
    
}
