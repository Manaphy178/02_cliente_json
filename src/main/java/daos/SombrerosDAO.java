package daos;

import java.util.*;

import modelo.*;

public interface SombrerosDAO {

	ArrayList<Sombrero> obtenerSombrero();

	void registrarSombrero(Sombrero s);

	void borrarSombrero(int id);

	void editarSombrero(Sombrero s);
	
}
