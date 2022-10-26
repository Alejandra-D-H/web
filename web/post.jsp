<%-- 
    Document   : post
    Created on : 14/10/2022, 01:08:27 AM
    Author     : usuario
--%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Information</title>
    </head>
    <body> 
        <h1>Student Information</h1>
        <form action="./GaleriaServlet" method="POST">
            <table>
            <tr>
                <th> Student ID </th>
                <th><input type="text" name="galeriaId" value="${galeria.galeriaId}"></th>
            </tr>
            <tr>
                <th> First Name </th>
                <th><input type="text" name="descripcion" value="${galeria.descripcion}"></th>
            </tr>
            <tr>
                <th> Last name </th>
                <th><input type="text" name="autor" value="${galeria.autor}"></th>
            </tr>
            <tr>
                <th> Year Level </th>
                <th><input type="text" name="titulo" value="${galeria.titulo}"></th>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" name="action" value="Add"/>
                    <input type="submit" name="action" value="Edit"/>
                    <input type="submit" name="action" value="Delete"/>
                    <input type="submit" name="action" value="Search"/>
                <td>
            </tr>
            
            </table>
        </form>
            <br>
            
            <table border="1">
                <th>Student Id</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Year Level</th>
                
                <c:forEach items="${allGaleria}" var="gal">
                    <tr>
                        <td>${gal.galeriaId}</td>
                        <td>${gal.descripcion}</td>
                        <td>${gal.autor}</td>
                        <td>${gal.titulo}</td>
                    </tr>
                </c:forEach>
            </table>
    </body>
</html>