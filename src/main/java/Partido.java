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

	public void registrarPartido(String equipoRival, String resultado, String fecha, String lugar) {
		Equipo equipoLocal = buscarEquipoLocalPorNombre(equipoRival);

		if (equipoLocal != null) {
			// Crear una nueva instancia de Partido con la información proporcionada.
			Partido partido = new Partido();
			partido.setEquipoRival(equipoRival);
			partido.setResultado(resultado);
			// Parsear la fecha a un objeto Date, dependiendo del formato de fecha que estés utilizando.
			// partido.setFecha(fecha);
			partido.setLugar(lugar);

			// Agregar el partido al historial de partidos del equipo local.
			equipoLocal.agregarPartido(partido);
		} else {
			System.out.println("Equipo local no encontrado."); // Manejo de error si el equipo local no se encuentra.
		}
	}

}
