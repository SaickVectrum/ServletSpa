<%-- 
    Document   : mostrarUsuarios
    Created on : 29 ago 2023, 20:01:50
    Author     : usuario
--%>

<%@page import="java.util.List"%>
<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Usuarios</title>
    </head>
    <body>
        <h1>Lista de Usuarios registrados</h1>
        <% 
            List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
            int cont = 1;
            for(Usuario usu : listaUsuarios){
        %>
        
        <p><b>Usuario N° <%=cont%></b></p>
        <p>Nombre: <%=usu.getNombre()%></p>
        <p>Celular: <%=usu.getCelular()%></p>
        <p>Correo electronico: <%=usu.getCorreoElectronico()%></p>
        <p>Contraseña: <%=usu.getContraseña()%></p>
        <p>-------------------------------------------</p>
        <% cont = cont +1;%>
        
        
        <%
            }    
        %>
        
    </body>
</html>
