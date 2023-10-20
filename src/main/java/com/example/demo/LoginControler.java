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

@WebServlet(name = "logines", value = "/logines")
public class LoginControler extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String usuario = req.getParameter("usuario"); //usuario es el nombre del imput desde el form que llamo
        String password = req.getParameter("password"); //password es el nombre del imput desde el form que llamo
        HttpSession session = req.getSession();
        RequestDispatcher disp = null;

        try {
            // Obtén la implementación de UsuarioDAO
            UsuarioDAO usuarioDAO = new UsuarioDAOImplem(); // Asegúrate de usar tu propia implementación

            // Verifica si existe un usuario con esos datos
            Usuario user = usuarioDAO.obtenerUsuario(usuario, password);

            if (user != null) {
                session.setAttribute("usuario", user.getUsuario());
                session.setAttribute("nombre", user.getNombre());
                session.setAttribute("apellido", user.getApellido());
                session.setAttribute("mail", user.getMail());
                disp = req.getRequestDispatcher("index.jsp"); //página a la que queremos volver
            }
                else {
                    session.setAttribute("error", "ErrorLogin");    //indicamos que se produjo un error
                    req.setAttribute("status", "failed");   //indicamos que se produjo un error
                    System.out.println("Usuario no registrado. Por favor, regístrate.");

                }

            disp.forward(req, resp);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}