public class Partido {
	private String equipoRival;
	private String resultado;
	private String fecha;
	private String lugar;
	private Equipo equipo;

	public String getEquipoRival() {
		return this.equipoRival;
	}

	public void setEquipoRival(String equipoRival) {
		this.equipoRival = equipoRival;
	}

	public String getResultado() {
		return this.resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return this.lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Partido(String equipoRival, String resultado, String fecha, String lugar) {
		super();
	}

	public registrarPartido(String equipoRival, String resultado, String fecha, String lugar)

}