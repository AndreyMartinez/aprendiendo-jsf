package clases;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;

@Stateless
@ManagedBean
public class UsuarioBean implements Serializable {

	private static final long serialVersionUID = -3837967313638004981L;
	

	public String iniciar(String nombre, String password) {
		String mensaje;
		if (nombre.equalsIgnoreCase("rafa") && password.equalsIgnoreCase("qwerty")) {
			 mensaje = "Bienvenido";
		} else {
			mensaje = "Error de autenticación";
		}
		return mensaje;
	}

}