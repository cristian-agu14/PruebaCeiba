package persistencia.repositorio.jpa;

import dominio.Producto;

public interface RepositorioGarantiaExtendida {
	
	/**
	 * Permite traer los productos por el nombre del cliente y el codigo del producto
	 * @return
	 */
	Producto obtenerPorCodigoAndNombre(String codigo, String nombreCliente);

}
