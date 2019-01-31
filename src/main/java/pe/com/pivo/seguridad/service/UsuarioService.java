package pe.com.pivo.seguridad.service;

import pe.com.pivo.seguridad.dominio.request.UsuarioListarRequest;
import pe.com.pivo.seguridad.dominio.response.UsuarioListarResponse;

public interface UsuarioService {
	
	public UsuarioListarResponse usuarioListar(UsuarioListarRequest request)throws Exception;

}
