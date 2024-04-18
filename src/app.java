import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		//objeto
		Tarjeta tarjeta = new Tarjeta(null,null);
		Cliente cliente= new Cliente(0,0);
		//scanner
	    Scanner lectura = new Scanner(System.in);
	    //Entrada
	    System.out.println("Ingrese el numero de la tarjeta");
	    String numeroTarjeta = lectura.next();
	    tarjeta.setNumeroTarjeta(numeroTarjeta);
	    
	    System.out.println("su tipo de tarjeta es:\n1. Debito\n2. Credito");
	    String tipoTarjeta = lectura.next();
	    tarjeta.setTipoTarjeta(tipoTarjeta);
	    
	    
	    System.out.println("Ingrese la clave");
	    int nuevaClave = lectura.nextInt();
	    cliente.ingresarClave(nuevaClave);
	    
	    Cajero cajero = new Cajero(0);
	    cajero.operarCajero();
	    
	    //array
	    ArrayList<String> datos = new ArrayList<>();
	  
        datos.add("Numero de tarjeta: " + numeroTarjeta);
        datos.add("tipo de tarjeta: " + tipoTarjeta);
        
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
