package clases;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class mensaje implements Serializable{
	
	private String nombre;
    private String password;
private String mensajeLogeo;

	







public String getMensajeLogeo() {
	return mensajeLogeo;
}

public void setMensajeLogeo(String mensajeLogeo) {
	this.mensajeLogeo = mensajeLogeo;
}

	private static final long serialVersionUID = -8691430703422524463L;

	
	 public String getNombre()
	 { 
		 return nombre; 
		 }
	 
	 public void setNombre(String nuevoValor)
	 { 
		 nombre = nuevoValor; 
		 }

	 
	 public String getPassword()
	 {
		 return password;
		 }
	 
	 public void setPassword(String nuevoValor) 
	 { 
		 password = nuevoValor; 
		 }
	 
	public void iniciar() {
 String nombre = "rafa";
		if (getNombre().equals(nombre) && getPassword().equals("qwerty")) {
	  setMensajeLogeo("Entraste a nuestra pagina");
  }
		else {
  System.out.println("no");
		setMensajeLogeo("error");
		}
	}



public static long getSerialversionuid() {
	return serialVersionUID;
} 

// acción de mi botón de logeo


	

	
	
}
