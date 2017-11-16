package clases;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class MensajeController implements Serializable {

	private static final long serialVersionUID = -8691430703422524463L;

	@Inject
	private UsuarioBean usuarioBean;

	private MensajeDto mensajeDto;

	@PostConstruct
	public void init() {
		mensajeDto = new MensajeDto();
	};

	
	
	public void iniciar() {
		System.out.println(usuarioBean.iniciar(mensajeDto.getNombre(), mensajeDto.getPassword()));
	}

	public MensajeDto getMensajeDto() {
		return mensajeDto;
	}

}
