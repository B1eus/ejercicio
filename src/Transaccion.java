
public class Transaccion {
private int IdTransaccion;
private double monto;
public Transaccion(int idTransaccion, double monto) {
	super();
	IdTransaccion = idTransaccion;
	this.monto = monto;
}
public int getIdTransaccion() {
	return IdTransaccion;
}
public void setIdTransaccion(int idTransaccion) {
	IdTransaccion = idTransaccion;
}
public double getMonto() {
	return monto;
}
public void setMonto(double monto) {
	this.monto = monto;
}

}
