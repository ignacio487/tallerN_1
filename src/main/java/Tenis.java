public class Tenis extends Deporte {
	private String superficieDeLaCancha;
	private String tipoDePartido;

	public String getSuperficieDeLaCancha() {
		return this.superficieDeLaCancha;
	}

	public void setSuperficieDeLaCancha(String superficieDeLaCancha) {
		this.superficieDeLaCancha = superficieDeLaCancha;
	}

	public String getTipoDePartido() {
		return this.tipoDePartido;
	}

	public void setTipoDePartido(String tipoDePartido) {
		this.tipoDePartido = tipoDePartido;
	}

	public Tenis(String superficieDeLaCancha, String tipoDePartido) {
		super();
	}

	public String getTipo() {
		return getTipo();
	}

	public void mostrarDetalles(Tenis tenis) {
		Tenis tenis1 = (Tenis) tipoTenis;
		System.out.println("superficie de la cancha:dura");
		System.out.println("superficie de la cancha" + tenis.getSuperficieDeLaCancha());
		System.out.println("TipoDePartido:dobles " + tenis.getTipoDePartido());
	}
}