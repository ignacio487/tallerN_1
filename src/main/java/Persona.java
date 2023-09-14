public class Persona {
	private String nombre;
	private String apellido;
	private String direccionDeCorreo;
	private String numeroDeContacto;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccionDeCorreo() {
		return this.direccionDeCorreo;
	}

	public void setDireccionDeCorreo(String direccionDeCorreo) {
		this.direccionDeCorreo = direccionDeCorreo;
	}

	public String getNumeroDeContacto() {
		return this.numeroDeContacto;
	}

	public void setNumeroDeContacto(String numeroDeContacto) {
		this.numeroDeContacto = numeroDeContacto;
	}

	public Persona(String nombre, String apellido, String direccionDeCorreo, String numeroDeContacto) {
		throw new UnsupportedOperationException();
	}
}