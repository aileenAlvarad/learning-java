package enero31;

import enero31.camiones.Autos;
import enero31.camiones.Camiones;
import enero31.camiones.Motocicletas;

public class AutomotoresPrincipal {

	public static void main(String[] args) {
		Motocicletas motocicletas = new Motocicletas();
		motocicletas.llantas();
		motocicletas.cargarGasolina();

		Autos autos = new Autos();
		autos.llantas();
		motocicletas.cargarGasolina();

		Camiones camiones = new Camiones();
		camiones.llantas();
		
		Persona aileen = new Persona("Aileen Alvarado");
		System.out.println(aileen);
		
	}

}
