package pe.com.pivo.seguridad.daoTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import pe.com.pivo.seguridad.dao.UsuarioDao;
import pe.com.pivo.seguridad.dao.impl.UsuarioDaoImpl;
import pe.com.pivo.seguridad.dominio.Usuario;
import pe.com.pivo.seguridad.dominio.request.UsuarioListarRequest;
import pe.com.pivo.seguridad.dominio.response.UsuarioListarResponse;

@RunWith(SpringRunner.class)
@ComponentScan(basePackages = { "pe.com.pivo.seguridad" })
@Import(UsuarioDaoImpl.class)
@TestPropertySource(locations = "classpath:application.properties")
public class UsuarioDAOTests {

	@Autowired
	private UsuarioDao usuarioDAO;

	@Test
	public void listarUsuario() {
		UsuarioListarRequest request = new UsuarioListarRequest();
		request.setpNoNombre(null);
		try {
			UsuarioListarResponse response = usuarioDAO.usuarioListar(request);
			for (Usuario usuario : response.getLsUsuario()) {
				System.out.println("Nombre Usuario: "+usuario.getNoLogin());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
			
}
