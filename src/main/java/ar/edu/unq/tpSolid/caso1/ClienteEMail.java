package ar.edu.unq.tpSolid.caso1;

import java.util.ArrayList;
import java.util.List;

public class ClienteEMail {

	ServidorPop servidor;
	String nombreUsuario;
	String passusuario;
	List<Correo> inbox = new ArrayList<>();
	List<Correo> borrados = new ArrayList<>();

	public ClienteEMail(ServidorPop servidor, String nombreUsuario, String passusuario) {
		this.servidor = servidor;
		this.nombreUsuario = nombreUsuario;
		this.passusuario = passusuario;
		this.conectar();
	}

	public void conectar() {
		this.servidor.conectar(nombreUsuario, passusuario);
	}

	public void recibirNuevos() {
		List<Correo> nuevos = this.servidor.recibirNuevos(nombreUsuario, passusuario);
		inbox.addAll(nuevos);
	}

	public void enviarCorreo(String asunto, String destinatario, String cuerpo) {
		this.servidor.enviar(new Correo(asunto, destinatario, cuerpo));
	}

	public void borrarCorreo(Correo correo) {
		inbox.remove(correo);
		borrados.add(correo);
	}

	public int contarInbox() {
		return inbox.size();
	}

	public int contarBorrados() {
		return borrados.size();
	}
}

//SRP (Single Responsibility Principle):
//ClienteEMail tiene múltiples responsabilidades:
//
//Conectarse a un servidor
//
//Gestionar correos (borrar, contar, enviar)
//
//Recibir nuevos correos
//
//OCP (Open-Closed Principle)
//NO ESTA ABIERTA A EXTENSIONES EN UN FUTURO!
