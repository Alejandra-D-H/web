/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.controller;

import com.dao.GaleriaDAOLocal;
import com.model.Galeria;
import java.io.DataInputStream;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author usuario
 */
public class GaleriaServlet extends HttpServlet {

    @EJB
    private GaleriaDAOLocal galeriaDAO;

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

        String action = request.getParameter("action");
        String galeriaIdStr = request.getParameter("galeriaId");
        int galeriaId = 0;
        if (galeriaIdStr != null && !galeriaIdStr.equals("")) {
            galeriaId = Integer.parseInt(galeriaIdStr);
        }
        String descripcion = request.getParameter("descripcion");
        String autor = request.getParameter("autor");
        String titulo = request.getParameter("titulo");

        /*
        Part foto = request.getPart("image");

        int fotoSize=(int)foto.getSize();//si no tiene tamaño, no hay foto
        byte[] img =null ; //el buffer
        if(fotoSize>0)
        {    img =new byte[fotoSize];
        try(DataInputStream dis=new DataInputStream(foto.getInputStream()))
        {        
            dis.readFully(img);
        }}
         */
        Galeria galeria = new Galeria(galeriaId, descripcion, autor, titulo);

        if ("Add".equalsIgnoreCase(action)) {
            galeriaDAO.addGaleria(galeria);
        } else if ("Edit".equalsIgnoreCase(action)) {
            galeriaDAO.editGaleria(galeria);
        } else if ("Delete".equalsIgnoreCase(action)) {
            galeriaDAO.deleteGaleria(galeriaId);
        } else if ("Search".equalsIgnoreCase(action)) {
            galeria = galeriaDAO.getGaleria(galeriaId);
        }

        request.setAttribute("galeria", galeria);
        request.setAttribute("allGaleria", galeriaDAO.getAllGaleria());
        request.getRequestDispatcher("blog-details.jsp").forward(request, response);
        response.setContentType("text/html;charset=UTF-8");

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
