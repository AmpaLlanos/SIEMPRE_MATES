package DAO;


import entidades.Usuario;

import java.util.List;

public interface UsuarioDAO {
    public List<Usuario> obtenerTodosLosUsuarios();
    public Usuario obtenerUsuarioPorId(int id);
    public Usuario obtenerUsuario(String usuario, String password);

    boolean agregarUsuario(Usuario usuario);

    public void actualizarUsuario(UsuarioDAO usuarioDAO);
    public void eliminarUsuario(int id);

}