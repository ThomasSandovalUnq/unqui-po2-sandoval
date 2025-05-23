package ar.edu.unq.tpSolid.caso1;

public class Correo {

	private String asunto;
	private String destinatario;
	private String cuerpo;

	public Correo(String asunto, String destinatario, String cuerpo) {
		this.asunto = asunto;
		this.destinatario = destinatario;
		this.cuerpo = cuerpo;
	}

	// Getters y Setters si los necesitás
	public String getAsunto() {
		return asunto;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public String getCuerpo() {
		return cuerpo;
	}

}
