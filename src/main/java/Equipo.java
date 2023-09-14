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
		ArrayList<Deportista> deportistasRepetidos = new ArrayList<>();

		for (Deportista d : deportistas) {
			if (d.getNombre().equals(deportista.getNombre())) {
				deportistasRepetidos.add(d);
			}
		}

		return deportistasRepetidos;
	}
	}

	public Equipo(String historialPartidos) {
		super();
	}
}