import java.util.ArrayList;
import java.util.Vector;

public class Equipo {
	private String historialPartidos;
	private Club club;
	private Deporte deporte;
	private Vector<Partido> partido = new Vector<Partido>();

	public String getHistorialPartidos() {
		return this.historialPartidos;
	}

	public void setHistorialPartidos(String historialPartidos) {
		this.historialPartidos = historialPartidos;
	}

	public ArrayList<Deportista> listaDeDeportistas(Deportista deportista) {
		return deportista;

	}

	public Equipo(String historialPartidos) {
		super();
	}
}