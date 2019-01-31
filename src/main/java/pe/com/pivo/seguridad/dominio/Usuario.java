package pe.com.pivo.seguridad.dominio;

import java.io.Serializable;

public class Usuario implements Serializable{

	private static final long serialVersionUID = 804489481608791240L;
	
	private Integer idUsuario;
	private String noLogin;
	private String noPassword;
	private String noNombre;
	private String noApellido;
	private String noEmail;
	private Integer idRol;
	private String noDescripcion;
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNoLogin() {
		return noLogin;
	}
	public void setNoLogin(String noLogin) {
		this.noLogin = noLogin;
	}
	public String getNoPassword() {
		return noPassword;
	}
	public void setNoPassword(String noPassword) {
		this.noPassword = noPassword;
	}
	public String getNoNombre() {
		return noNombre;
	}
	public void setNoNombre(String noNombre) {
		this.noNombre = noNombre;
	}
	public String getNoApellido() {
		return noApellido;
	}
	public void setNoApellido(String noApellido) {
		this.noApellido = noApellido;
	}
	public String getNoEmail() {
		return noEmail;
	}
	public void setNoEmail(String noEmail) {
		this.noEmail = noEmail;
	}
	public Integer getIdRol() {
		return idRol;
	}
	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}
	public String getNoDescripcion() {
		return noDescripcion;
	}
	public void setNoDescripcion(String noDescripcion) {
		this.noDescripcion = noDescripcion;
	}

}
