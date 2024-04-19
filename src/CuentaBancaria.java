import java.util.Scanner;

public class CuentaBancaria {
private String numeroCuenta;
private double saldo;
public CuentaBancaria(String numeroCuenta, double saldo) {
	super();
	this.numeroCuenta = numeroCuenta;
	this.saldo = saldo;
}
public String getNumeroCuenta() {
	return numeroCuenta;
}
public void setNumeroCuenta(String numeroCuenta) {
	this.numeroCuenta = numeroCuenta;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
public void consultarSaldo() {
	if (saldo>=0) {
        System.out.println("Su saldo es: " + getSaldo());
	}
}
public boolean retirar(Transaccion transaccion) {
    double monto;
    Scanner leer = new Scanner(System.in); 
    System.out.println("el saldo disponible: "+getSaldo());
    System.out.println("Ingrese el monto a retirar:");
    monto = leer.nextDouble();
    boolean mon = false; 
    
    do {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("saldo disponible: " +getSaldo());
            mon = true; 
        } else {
            System.out.println("Monto inválido para retirar. Ingrese un monto válido:");
            monto = leer.nextDouble(); 
        }
    } while (!mon && (monto <= 0 || monto > getSaldo())); 
    
    return mon;
}

public boolean depositar(Transaccion transaccion) {
    double monto;
    Scanner leer1 = new Scanner(System.in); 
    boolean depositoExitoso = false;
    
    do {
        System.out.println("Ingrese el monto a depositar:");
        monto = leer1.nextDouble();
        
        if (monto >= 0) {
            saldo += monto;
            System.out.println("Saldo disponible: " + getSaldo());
            depositoExitoso = true;
        } else {
            System.out.println("Valor erróneo para depositar. Ingrese un monto válido:");
        }
    } while (!depositoExitoso); 
    
    return depositoExitoso;
}
}

