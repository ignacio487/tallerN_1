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
		// Verifica que el deporte y el rol coincidan con los del deportista.
		if (this.deporte.equals(deporte) && this.rol.equals(rol)) {
			// Agrega las estadísticas al deportista.
			this.experiencia = experiencia;
		} else {
			System.out.println("No se pueden agregar estadísticas: deporte o rol incorrectos.");
		}
	}
}