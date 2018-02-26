/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.beraclick.controlador;

import com.app.beraclick.modelo.conexion.ConexionDB;
import com.app.beraclick.modelo.dao.EmpleadoDAO;
import com.app.beraclick.modelo.vo.EmpleadoVO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Julián Flórez
 */
public class SrvRegistroUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            try {

                Connection cnn = ConexionDB.getConexion();
                EmpleadoVO datosEmpleado = new EmpleadoVO();

                String cedula = request.getParameter("cedula");
                String tipoCedula = request.getParameter("tipoDoc");

                String nombre1 = request.getParameter("nom1");
                String nombre2 = request.getParameter("nom2");
                String apellido1 = request.getParameter("ape1");
                String apellido2 = request.getParameter("ape2");
                String cargo = request.getParameter("car");

                String rol = request.getParameter("rol");

                String usuario = request.getParameter("usrname");
                String psswd = request.getParameter("pss");
                String psswd2 = request.getParameter("pss2");

                String especialidad = request.getParameter("esp");

                
                String estado = request.getParameter("est");
                String correo = request.getParameter("mail");

                ////////////////////////////////////////////////////
                datosEmpleado.setNombre1(nombre1);
                datosEmpleado.setNombre2(nombre2);
                datosEmpleado.setApellido1(apellido1);
                datosEmpleado.setApellido2(apellido2);
                datosEmpleado.setCargo(cargo);
                datosEmpleado.setUsuario(usuario);
                datosEmpleado.setClave(psswd2);
                datosEmpleado.setNumeroDocumento(cedula);
                datosEmpleado.setIdTipoDocumento_FK(Integer.parseInt(tipoCedula));
                datosEmpleado.setIdRol_FK(Integer.parseInt(rol));
                datosEmpleado.setIdEspecialidad_FK(Integer.parseInt(especialidad));
                datosEmpleado.setEstado(estado);
                datosEmpleado.setCorreo(correo);
                
                EmpleadoDAO empleadoInsert = new EmpleadoDAO(cnn);
                
                empleadoInsert.insert(datosEmpleado);
                
                
                ConexionDB.desconectarDB(cnn);

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SrvRegistroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(SrvRegistroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
