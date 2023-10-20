package com.example.demo;

import DAO.UsuarioDAO;
import entidades.Usuario;
import impermentacionDAO.UsuarioDAOImplem;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "registro", value = "/registro")
public class RegistroControler extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String mail = req.getParameter("mail");
        HttpSession session = req.getSession();
        RequestDispatcher disp = null;


        try {
            // Obtén la implementación de UsuarioDAO
            UsuarioDAO usuarioDAO = new UsuarioDAOImplem(); // Asegúrate de usar tu propia implementación

            // Crea un nuevo usuario con los datos proporcionados
            Usuario nuevoUsuario = new Usuario();
            nuevoUsuario.setUsuario(usuario);
            nuevoUsuario.setPassword(password);
            nuevoUsuario.setNombre(nombre);
            nuevoUsuario.setApellido(apellido);
            nuevoUsuario.setMail(mail);

            // Agrega el nuevo usuario a la base de datos
            boolean exito = usuarioDAO.agregarUsuario(nuevoUsuario);

            if (exito == true) {
                session.setAttribute("mensaje", "Registro exitoso");
                disp = req.getRequestDispatcher("login.jsp"); // Página de registro exitoso
                System.out.println("okey");
            } else {
                session.setAttribute("error", "ErrorRegistro");
                req.setAttribute("status", "failed");
                System.out.println("error");
                disp = req.getRequestDispatcher("registro.jsp"); // Página de registro con error
            }
            disp.forward(req, resp);
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
