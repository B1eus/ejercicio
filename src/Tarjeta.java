
public class Tarjeta {
	private String numeroTarjeta;
	private String tipoTarjeta;
	public Tarjeta(String numeroTarjeta, String tipoTarjeta) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.tipoTarjeta = tipoTarjeta;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public String getTipoTarjeta() {
		return tipoTarjeta;
	}
	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}
	public String ValidarTarjeta(String tipoTarjeta) {
	    if (tipoTarjeta.equals("1")) {
	        return "Tarjeta de débito";
	    } else if (tipoTarjeta.equals("2")) {
	        return "Tarjeta de crédito";
	    } else {
	        return "Inválido";
	    }
	}
}
