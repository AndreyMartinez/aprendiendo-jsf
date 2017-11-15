package clases;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "usuarioBean", eager = true)
@RequestScoped

public class usuarioBean implements Serializable {

	private static final long serialVersionUID = -3837967313638004981L;

	private String  mensaje;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}