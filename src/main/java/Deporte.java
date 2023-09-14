import java.util.Vector;

public abstract class Deporte {
	private String tipo;
	public Deportista unnamed_Deportista_;
	private Vector<Equipo> equipo = new Vector<Equipo>();
	public Entrenador unnamed_Entrenador_;

	public ArrayList<Equipo> obtenerEquipos(Equipo equipo) {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Deporte(String tipo) {
		throw new UnsupportedOperationException();
	}
}