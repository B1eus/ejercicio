import java.util.Scanner;
public class Cajero {
private int IdCajero;

public Cajero(int idCajero) {
	super();
	IdCajero = idCajero;
}

public int getIdCajero() {
	return IdCajero;
}

public void setIdCajero(int idCajero) {
	IdCajero = idCajero;
}
public void operarCajero() {
	//objeto
	Tarjeta tarjeta = new Tarjeta(null,null);
	//scanner
    Scanner lectura = new Scanner(System.in);
    //Entrada
    System.out.println("Ingrese la tarjeta");
    String numeroTarjeta = lectura.next();
    tarjeta.setNumeroTarjeta(numeroTarjeta);
    
    System.out.println("1. Debito\n2. Credito\n");
    String tipoTarjeta = lectura.next();
    tarjeta.setTipoTarjeta(tipoTarjeta);
    
    Cliente cliente= new Cliente(IdCajero);
    System.out.println("Ingrese la clave");
    cliente.ingresarClave();
}
}
