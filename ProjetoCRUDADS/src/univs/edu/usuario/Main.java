package univs.edu.usuario;


public class Main {
    
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        UsuarioDAO dao = new UsuarioDAO();
        
        usuario.setLogin("admin");
        usuario.setNomeUsuario("Adriano Lima");
        usuario.setSenha("123");
        
        dao.salvar(usuario);
    }
    
}