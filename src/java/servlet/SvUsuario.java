
package servlet;

import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "SvUsuario", urlPatterns = {"/SvUsuario"})
public class SvUsuario extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
        
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("Pepe","3015247","pepe12@gmail.com","pepito123"));
        listaUsuarios.add(new Usuario("Manuel","3129267","manuben@gmail.com","man123nuel"));
        listaUsuarios.add(new Usuario("Luna","3015247","pepe12@gmail.com","pepito123"));
        
            
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaUsuarios", listaUsuarios);
        
        
        
        response.sendRedirect("mostrarUsuarios.jsp");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nombre = request.getParameter("nombre");
        String celular = request.getParameter("celular");
        String correoElectronico = request.getParameter("correoElectronico");
        String contraseña = request.getParameter("contraseña");
        
        
        
        
        System.out.println("Nombre es:" + nombre);
        System.out.println("Celular es:" + celular);
        System.out.println("Correo Electronico es:" + correoElectronico);
        System.out.println("contraseña es:" + contraseña);
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
