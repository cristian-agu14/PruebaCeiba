package persistencia.repositorio.jpa;

import dominio.Producto;

public interface RepositorioGarantiaExtendida {
	
	/**
	 * Permite traer los productos por el nombre del cliente y el codigo del producto
	 * @return
	 */
	Producto obtenerPorCodigoAndNombre(String codigo, String nombreCliente);
	
	/**
	 * Permite traer los productos por el codigo de los productos
	 * @param codigo, String que representa el codigo del producto
	 * @return Producto
	 */
	Producto obtenerPorCodigo(String codigo);

}
