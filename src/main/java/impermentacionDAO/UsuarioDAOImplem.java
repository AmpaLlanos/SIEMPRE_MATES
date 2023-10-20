package impermentacionDAO;



import DAO.UsuarioDAO;
import entidades.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOImplem implements UsuarioDAO {
    private Connection conect;
    private Usuario usuario;

    public UsuarioDAOImplem() {
        conect = conexion.conexion.getConexion();
    }

    @Override
    public List<Usuario> obtenerTodosLosUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        try{
            PreparedStatement statement = conect.prepareStatement("Select * from usuarios");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Usuario usuario = new Usuario();
                usuario.setId(resultSet.getInt("idusuario"));
                usuario.setUsuario(resultSet.getString("usuario"));
                usuario.setNombre(resultSet.getString("nombre"));
                usuario.setApellido(resultSet.getString("apellido"));
                usuario.setMail(resultSet.getString("mail"));
                usuario.setPassword(resultSet.getString("password"));
                usuarios.add(usuario);
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    public Usuario obtenerUsuarioPorId(int id){
        Usuario usuario = null;
        try{
            PreparedStatement statement = conect.prepareStatement("Select * from usuarios wehere idusuario = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                usuario = new Usuario();
                usuario.setId(resultSet.getInt("idusuario"));
                usuario.setUsuario(resultSet.getString("usuario"));
                usuario.setNombre(resultSet.getString("nombre"));
                usuario.setApellido(resultSet.getString("apellido"));
                usuario.setMail(resultSet.getString("mail"));
                usuario.setPassword(resultSet.getString("password"));
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }

    public Usuario obtenerUsuario(String usuario, String password){
        Usuario Usuario= null;
        try{
            PreparedStatement statement = conect.prepareStatement("Select * from usuario where mail= ? and password = ?");
            statement.setString(1, usuario);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Usuario = new Usuario();
                Usuario.setId(resultSet.getInt("idusuario"));
                Usuario.setUsuario(resultSet.getString("usuario"));
                Usuario.setNombre(resultSet.getString("nombre"));
                Usuario.setApellido(resultSet.getString("apellido"));
                Usuario.setMail(resultSet.getString("mail"));
                Usuario.setPassword(resultSet.getString("password"));
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return Usuario;
    }




@Override
public boolean agregarUsuario(Usuario usuario) {
        this.usuario = usuario;
        try {
                PreparedStatement statement = conect.prepareStatement("INSERT INTO usuario (usuario, nombre, apellido, mail, password) VALUES (?, ?, ?, ?, ?)");
                statement.setString(1, usuario.getUsuario());
                statement.setString(2, usuario.getNombre());
                statement.setString(3, usuario.getApellido());
                statement.setString(4, usuario.getMail());
                statement.setString(5, usuario.getPassword());
                System.out.println(usuario.getMail());
                int filasAfectadas = statement.executeUpdate();
                return true;
            } catch (SQLException e) {
                e.printStackTrace();

            }
        return false;
    }

    @Override
    public void actualizarUsuario(UsuarioDAO usuarioDAO) {

    }



    public void actualizarUsuario(Usuario usuario){
        String consulta = "update usuarios set usuario = ?, nombre = ?, apellido = ?, correo = ?, password = ? where id = ?";

        try{
            PreparedStatement st = conect.prepareStatement(consulta);
            st.setString(1, usuario.getUsuario());
            st.setString(2, usuario.getNombre());
            st.setString(3, usuario.getApellido());
            st.setString(4, usuario.getMail());
            st.setString(5, usuario.getPassword());
            st.setInt(6, usuario.getId());
            st.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void eliminarUsuario(int id){
        String consulta = "delete from usuario where id = " + id;
        try{
            PreparedStatement st = conect.prepareStatement(consulta);
            st.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}