package Entidades;

public class ControleUsuario {
	
	private static Usuario usuarioLogado;
	
	public static Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public static void setUsuarioLogado(Usuario usuario) {
        usuarioLogado = usuario;
    }
}
