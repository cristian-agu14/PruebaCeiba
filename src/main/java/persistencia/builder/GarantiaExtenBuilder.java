package persistencia.builder;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import dominio.GarantiaExtendida;
import dominio.Producto;
import persistencia.entitad.GarantiaExtendidaEntity;

public class GarantiaExtenBuilder {

	private GarantiaExtenBuilder() {
	}

	public static GarantiaExtendida convertirADominio(GarantiaExtendidaEntity garantiaExtendidaEntity) {

		GarantiaExtendida garantiaExtendida = null;

		if (garantiaExtendidaEntity != null) {

			Producto producto = ProductoBuilder.convertirADominio(garantiaExtendidaEntity.getProducto());

			garantiaExtendida = new GarantiaExtendida(producto, garantiaExtendidaEntity.getFechaSolicitudGarantia(),
					garantiaExtendidaEntity.getFechaFinGarantia(), garantiaExtendidaEntity.getPrecio(),
					garantiaExtendidaEntity.getNombreCliente());

		}
		return garantiaExtendida;

	}


}
