import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		//objeto
		Cajero cajero = new Cajero(231213245);
		Tarjeta tarjeta = new Tarjeta(null,null);
		Cliente cliente= new Cliente(112313,0);
		Transaccion transaccion = new Transaccion(0,0);
		CuentaBancaria cuentaA = new CuentaBancaria(null,0 );
		//scanner
		Scanner lectura = new Scanner(System.in);
		//array
		ArrayList<String> datos = new ArrayList<>();
		//Entrada
		System.out.println("Ingrese el numero de la tarjeta");
		String numeroTarjeta = lectura.next();
		tarjeta.setNumeroTarjeta(numeroTarjeta);
		datos.add("Numero de tarjeta: " + numeroTarjeta);
		String tipoTarjeta;

		System.out.println("Su tipo de tarjeta es:\n1. Débito\n2. Crédito");
		tipoTarjeta = lectura.next();
		tarjeta.setTipoTarjeta(tipoTarjeta);


		datos.add("Tipo de tarjeta: " + tarjeta.ValidarTarjeta(tipoTarjeta));

		System.out.println("Ingrese la clave");
		int nuevaClave = lectura.nextInt();
		cliente.ingresarClave(nuevaClave);
		datos.add("clave: " + nuevaClave);
		//metodos
		Cajero.operarCajero();

		//salida
		System.out.println("\tTIKET CAJERO\t");
		System.out.println("\tid cajero: #"+cajero.getIdCajero());
		System.out.println("\tid cliente: #"+cliente.getIdCliente());
		System.out.println("\tnumero de cuenta:"+cuentaA.getNumeroCuenta());
		System.out.println("\tnumero de tarjeta:"+tarjeta.getNumeroTarjeta());
		tarjeta.ValidarTarjeta(tipoTarjeta); 
		System.out.println("\tSaldo disponible:"+cuentaA.getSaldo());


		try {
			FileWriter writer = new FileWriter("datos.txt");
			for (String dato : datos) {
				writer.write(dato + "\n");
			}
			writer.close();
			System.out.println("Datos guardados en datos.txt");
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo");
			e.printStackTrace();
		}
	}

}
