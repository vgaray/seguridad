package pe.com.pivo.seguridad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pe.com.pivo.seguridad.dominio.request.UsuarioListarRequest;
import pe.com.pivo.seguridad.dominio.response.UsuarioListarResponse;
import pe.com.pivo.seguridad.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioServices;
	
	
	@RequestMapping(value = "/listar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public UsuarioListarResponse usuarioListar(@RequestBody UsuarioListarRequest request, @RequestHeader("codUsuario") String codUsuario, @RequestHeader("token") String token)
	{
		UsuarioListarResponse response = new UsuarioListarResponse();
		try
		{
			response = usuarioServices.usuarioListar(request);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return response;
	}	
	
	
	}
