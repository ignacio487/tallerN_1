public class Baloncesto extends Deporte {
	private String tipoDeCancha;
	private int tiemposJugados;

	public String getTipoDeCancha() {
		return this.tipoDeCancha;
	}

	public void setTipoDeCancha(String tipoDeCancha) {
		this.tipoDeCancha = tipoDeCancha;
	}

	public int getTiemposJugados() {
		return this.tiemposJugados;
	}

	public void setTiemposJugados(int tiemposJugados) {
		this.tiemposJugados = tiemposJugados;
	}

	public Baloncesto(String tipoDeCancha, int tiemposJugados) {
		super();
	}

	public String getTipo() {
		return getTipo();
	}

	public void mostrarDetalles(Baloncesto baloncesto) {
		Baloncesto baloncesto1 = (Baloncesto) tipoBaloncesto;
		System.out.println("tipo de la cancha:exterior");
		System.out.println("tipo de la cancha" + baloncesto.getTipoDeCancha());
		System.out.println("NumeroDeTiempos:4" + baloncesto.getTiemposJugados();
	}
}