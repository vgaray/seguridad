package pe.com.pivo.seguridad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.pivo.seguridad.dao.UsuarioDao;
import pe.com.pivo.seguridad.dominio.request.UsuarioListarRequest;
import pe.com.pivo.seguridad.dominio.response.UsuarioListarResponse;
import pe.com.pivo.seguridad.service.UsuarioService;


@Transactional
@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService{
	@Autowired
	private UsuarioDao usuarioDAO;	

	@Override
	public UsuarioListarResponse usuarioListar(UsuarioListarRequest request) throws Exception {
		UsuarioListarResponse response=usuarioDAO.usuarioListar(request);
		return response;
	}

}
