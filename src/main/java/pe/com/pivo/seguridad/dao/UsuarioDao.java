package pe.com.pivo.seguridad.dao;

import pe.com.pivo.seguridad.dominio.request.UsuarioListarRequest;
import pe.com.pivo.seguridad.dominio.response.UsuarioListarResponse;

public interface UsuarioDao {
	
	public UsuarioListarResponse usuarioListar(UsuarioListarRequest request)throws Exception;

}
