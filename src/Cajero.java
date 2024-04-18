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
	CuentaBancaria cuentab =new CuentaBancaria(null, IdCajero);
	int op = 0;
	do {
		
    switch (op) {
    
      case 1:
    	  System.out.println("Menu");
    	  System.out.println("1. Consultar Saldo");
    	  cuentab.consulatSaldo();
      case 2:
    	  System.out.println("2. Retirar");
    	  cuentab.retirar(0);
      case 3:
    	  System.out.println("3. Depositar");
    	  cuentab.depositar(0);;
	}
}while (op !=3);
}
}
