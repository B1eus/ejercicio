
public class Cliente {
private int IdCliente;
private int clave;


public Cliente(int idCliente,int clave) {
	super();
	IdCliente = idCliente;
	this.clave = clave;
}

public int getIdCliente() {
	return IdCliente;
}

public void setIdCliente(int idCliente) {
	IdCliente = idCliente;
}
public void ingresarTarjeta() {
	
}
public void ingresarClave(int nuevaClave) {
	this.clave = nuevaClave;
}
public void SeleccionarOperacion() {
	
}

}
