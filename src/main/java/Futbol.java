public class Futbol extends Deporte {
	private String tipoDeCampo;
	private String condicion;

	public String getTipoDeCampo() {
		return this.tipoDeCampo;
	}

	public void setTipoDeCampo(String tipoDeCampo) {
		this.tipoDeCampo = tipoDeCampo;
	}

	public String getCondicion() {
		return this.condicion;
	}

	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}

	public Futbol(String tipoDeCampo, String condicion) {
		super();
	}

	public String getTipo() {
		return getTipo();
	}

	public void mostrarDetalles(Futbol futbol) {
		Futbol futbol1 = (Futbol) tipoFutbol;
		System.out.println("Tipo de campo:sintetico");
		System.out.println("Tipo de campo " + futbol.getTipoDeCampo());
		System.out.println("Condicion:local " + futbol.getCondicion());
	}
}