package lluviameses;

public class Lluviameses {

	private int[] meses;

	public Lluviameses() {

		// inicializar meses a cero
		meses = new int[12];
		for (int i = 0; i < meses.length; i++) {
			meses[i] = 0;

		}

	}

	// introducir la cantidad de agua por mes
	public void registrarlluviames(int mes, int cantidadlluvia) {

		validarmes(mes);
		meses[mes] = cantidadlluvia;

	}

	// consultar la cantidad de lluvia de un mes determinado
	public int consultarlluviames(int mes) {

		validarmes(mes);
		return meses[mes];
	}

	// calcular la cantidad de lluvia caida en un a�o
	public int sumarcantidadlluvia() {

		int cantidadlluvia = 0;

		for (int i = 0; i < meses.length; i++) {
			cantidadlluvia = cantidadlluvia + meses[i];
		}

		return cantidadlluvia;
	}

	// consultar el cuatrimestre m�s lluvioso
	public int consultarCuatrimestreMasLluvioso() {

		int cuatrimestreMasLluvioso = 0;
		int cuatrimestres[];
		cuatrimestres = new int[3];

		cuatrimestres[0] = meslluviarango(0, 3);
		cuatrimestres[1] = meslluviarango(4, 7);
		cuatrimestres[2] = meslluviarango(8, 11);

		if (cuatrimestres[0] < cuatrimestres[1]) {
			cuatrimestreMasLluvioso = 0;

		} else {

			if (cuatrimestres[0] < cuatrimestres[2]) {
				cuatrimestreMasLluvioso = 1;

			}

		}

		if (cuatrimestres[1] < cuatrimestres[2]) {
			cuatrimestreMasLluvioso = 2;

		}

		return cuatrimestreMasLluvioso;

	}

	private int validarmes(int mes) {

		Error mesIncorrecto = new Error("mes fuera del rango (1 ; 12]");

		if (mes < 0 || mes > 12) {
			throw mesIncorrecto;

		}

		return mes;

	}

	private int meslluviarango(int inicio, int fin) {

		int total = 0;

		for (int i = inicio; i <= fin; i++) {

			total = total + meses[i];

		}

		return total;
	}

}
