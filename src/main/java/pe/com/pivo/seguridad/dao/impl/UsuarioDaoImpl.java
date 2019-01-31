package pe.com.pivo.seguridad.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import pe.com.pivo.seguridad.dao.UsuarioDao;
import pe.com.pivo.seguridad.dominio.Usuario;
import pe.com.pivo.seguridad.dominio.request.UsuarioListarRequest;
import pe.com.pivo.seguridad.dominio.response.UsuarioListarResponse;

@Repository("usuarioDao")
public class UsuarioDaoImpl extends ConexionDaoImpl implements UsuarioDao  {

	@Override
	public UsuarioListarResponse usuarioListar(UsuarioListarRequest request) throws Exception {
		
		String query = "UsuarioMapper.listarUsuario";
		SqlSession session = getSqlSessionFactory().openSession();
		HashMap map = new HashMap();
		map.put("pNoNombre", request.getpNoNombre());
		List<Usuario> usuarioList = session.selectList(query, map);
		session.close();
		UsuarioListarResponse response = new UsuarioListarResponse();
		response.setLsUsuario(usuarioList);
		return response;
	}

}
