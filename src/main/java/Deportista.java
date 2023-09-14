public class Deportista extends Persona {
	private Deporte deporte;
	private String rol;
	private int experiencia;
	private Club club;
	public Deporte unnamed_Deporte_;

	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Deportista(Deporte deporte, String rol, int experiencia) {
		super();
	}

	public int getExperiencia() {
		return this.experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public void agregarEstadistica(Deporte deporte, String rol, int experiencia) {
		String claveEstadistica = deporte.getNombre() + "-" + rol;
		if (!estadisticas.containsKey(claveEstadistica)) {
			estadisticas.put(claveEstadistica, new EstadisticaDeportista());
		}
		EstadisticaDeportista estadistica = estadisticas.get(claveEstadistica);
		estadistica.setExperiencia(experiencia);
	}
}