import java.util.Vector;

public class Club {
	private String nombre;
	private Vector<Deportista> deportista = new Vector<Deportista>();
	private Vector<Entrenador> entrenador = new Vector<Entrenador>();
	private Vector<Equipo> equipo = new Vector<Equipo>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarDeportista(Deportista deportista) {
		deportista.add(deportista);
	}

	public void agregarEntrenador(Entrenador entrenador) {
		entrenador.add(entrenador);
	}

	public Club(String nombre) {
		super();
	}

	public void agregarEquipo(Equipo equipo){
		equipo.add(equipo);
	}
}