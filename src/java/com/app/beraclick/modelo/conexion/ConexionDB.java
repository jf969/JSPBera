package com.app.beraclick.modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Julián Flórez
 */
public class ConexionDB {

    public static Connection getConexion() throws ClassNotFoundException, SQLException {

        Connection cnn;
        Class.forName("com.mysql.jdbc.Driver");
        cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/beraclickdb", "root", "root");
        cnn.setAutoCommit(false);
        return cnn;
    }

    public static void desconectarDB(Connection cnn) throws SQLException {
        cnn.commit();
        cnn.close();
    }

    public static void rollbackDB(Connection cnn) throws SQLException {
        cnn.rollback();
        cnn.close();
    }
}
