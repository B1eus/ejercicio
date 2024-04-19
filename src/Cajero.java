import java.util.Scanner;
public class Cajero {
private int IdCajero = 123246;

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
public static void operarCajero() {
        CuentaBancaria cuentab = new CuentaBancaria( null, 2000000);
        Transaccion transaccion = new Transaccion(14565,0);
        int op = 0;
        Scanner scanner = new Scanner(System.in);

        do {
        	System.out.println("Menu");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Retirar");
            System.out.println("3. Depositar");
            System.out.println("4. Salir");
            System.out.println("Ingrese su opción:");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    cuentab.consultarSaldo();
                    break;
                case 2:
                	
                    if (cuentab.retirar(transaccion)) 
                        System.out.println("Retiro exitoso.");
                   
                    break;
                case 3:
                    if (cuentab.depositar(transaccion)) 
                        System.out.println("Depósito exitoso.");
                   
                    break;
                case 4:
                	System.out.println("saliendo....");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (op != 4);
    }
}
