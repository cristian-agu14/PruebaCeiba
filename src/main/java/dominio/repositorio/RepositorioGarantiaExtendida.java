package dominio.repositorio;

import dominio.Producto;


import dominio.GarantiaExtendida;

public interface RepositorioGarantiaExtendida {

	/**
	 * Permite obtener un producto con garantia extendida dado un codigo
	 * @param codigo
	 * @return
	 */
	Producto obtenerProductoConGarantiaPorCodigo(String codigo);
	
	/**
	 * Permite agregar una garantia al repositorio de garantia
	 * @param garantia
	 */
	void agregar(GarantiaExtendida garantia);
	
	/**
	 * Permite obtener una garantia extendida por el codigo del producto
	 * @param codigo
	 */
	GarantiaExtendida obtener(String codigo);
	
	/**
	 * Permite traer los productos por el nombre del cliente y el codigo del producto
	 * @return
	 */	
	GarantiaExtendida obtenerPorProductoAndNombreCliente(Producto producto, String nombreCliente);
	
	/**
	 * Permite traer una garantiaExtendida por el codigo del porducto asociada a ella
	 * @param codigo, codigo del producto
	 * @return {@link GarantiaExtendida}
	 */
	GarantiaExtendida ObtenerPorProducto(String codigo);

}
