package dominio;

import dominio.repositorio.RepositorioProducto;

import java.util.regex.Pattern;

import dominio.repositorio.RepositorioGarantiaExtendida;

public class Vendedor {

	public static final String EL_PRODUCTO_TIENE_GARANTIA = "El producto ya cuenta con una garantia extendida";

	public static final String PATTERN = "[aeiouAEIOU]";

	private RepositorioProducto repositorioProducto;
	private RepositorioGarantiaExtendida repositorioGarantia;

	public Vendedor(RepositorioProducto repositorioProducto, RepositorioGarantiaExtendida repositorioGarantia) {
		this.repositorioProducto = repositorioProducto;
		this.repositorioGarantia = repositorioGarantia;

	}

	public void generarGarantia(String codigo) {

		throw new UnsupportedOperationException("Método pendiente por implementar");

	}

	/**
	 * Metodo que verifica si el codigo del producto contiene 3 vocales
	 * 
	 * @param codigo, String al cual se le va a comprobar si tiene 3 vocales
	 * @return true si el codigo contiene 3 vocales
	 * @return false si el codigo no contiene 3 vocales
	 */
	public boolean verificarVocales(String codigo) {
		int contadorVocales = 0;

		String[] vector = codigo.split("");

		for (int i = 0; i < vector.length; i++) {

			String letra = vector[i];

			boolean vocal = Pattern.matches(PATTERN, letra);

			if (vocal) {
				contadorVocales++;
			}
		}

		if (contadorVocales == 3) {
			return true;
		} else {
			return false;
		}
	}

	public boolean tieneGarantia(String codigo) {

		Producto producto = repositorioProducto.obtenerPorCodigo(codigo);

		if (producto != null) {
			return true;
		} else {
			return false;
		}
	}

}
