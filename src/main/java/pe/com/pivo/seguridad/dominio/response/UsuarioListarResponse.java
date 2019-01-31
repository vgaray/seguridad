package pe.com.pivo.seguridad.dominio.response;

import java.util.List;

import pe.com.pivo.seguridad.dominio.Usuario;

public class UsuarioListarResponse {
	
	private List<Usuario> lsUsuario;

	public List<Usuario> getLsUsuario() {
		return lsUsuario;
	}

	public void setLsUsuario(List<Usuario> lsUsuario) {
		this.lsUsuario = lsUsuario;
	}

}
