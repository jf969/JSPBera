/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.beraclick.controlador;

import com.app.beraclick.modelo.conexion.ConexionDB;
import com.app.beraclick.modelo.dao.TipologiasDAO;
import com.app.beraclick.modelo.vo.TipologiasVO;
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
public class SrvRegistroTipo extends HttpServlet {

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
            try {
                Connection cnn = ConexionDB.getConexion();
                TipologiasVO tipo = new TipologiasVO();
                
                String nombreT = request.getParameter("nomT");
                String paisT = request.getParameter("paisT");
                String estadoT = request.getParameter("estadoT");
                String espeT = request.getParameter("espT");
                
                //////////////////////////////////////////////
                
                tipo.setNombreTipologia(nombreT);
                tipo.setIdPais_FK(Integer.parseInt(paisT));
                tipo.setEstadoTipologia(estadoT);
                tipo.setIdEspecialidad_FK(Integer.parseInt(paisT));
                
                TipologiasDAO tipoDAO = new TipologiasDAO(cnn);
                
                tipoDAO.insert(tipo);
                
                ConexionDB.desconectarDB(cnn);
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SrvRegistroTipo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(SrvRegistroTipo.class.getName()).log(Level.SEVERE, null, ex);
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
