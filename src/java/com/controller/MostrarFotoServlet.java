/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.controller;


import com.dao.GaleriaDAOLocal;
import com.model.Galeria;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author usuario
 */
@MultipartConfig
@WebServlet(name = "MostrarFotoServlet", urlPatterns = {"/MostrarFotoServlet"})
public class MostrarFotoServlet extends HttpServlet {

    @EJB
    private GaleriaDAOLocal galeriaDAO;
    
/*
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String $galeriaId = req.getParameter("galeriaId");

        int id = Integer.parseInt($galeriaId);

        Galeria galeria = galeriaDAO.getGaleria(id);

        byte[] foto = galeria.getImage();

        resp.getOutputStream().write(foto);

    }
*/
}
