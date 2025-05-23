package ar.edu.unq.tpSolid.caso1;

import java.util.List;

public interface IServidor {

	List<Correo> recibirNuevos(String user, String pass);
	void conectar(String nombreUsuario, String passusuario);
	void enviar(Correo correo);
}

//ISP (Interface Segregation Principle):
//IServidor tiene métodos que ServidorPop no implementa (resetear, tazaDeTransferencia, etc.),
// lo que indica una interfaz con demasiadas responsabilidades.