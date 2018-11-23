package persistencia.builder;

import dominio.GarantiaExtendida;
import persistencia.entitad.GarantiaExtendidaEntity;

public class GarantiaExtenBuilder {

	private GarantiaExtenBuilder() {

	}

//	public static GarantiaExtendida convertirADominio(GarantiaExtendidaEntity garantiaExtendidaEntity){
//		
//		GarantiaExtendida garantiaExtendida = null;
//		
//		if(garantiaExtendidaEntity != null){
//			
//			garantiaExtendida = new GarantiaExtendida(garantiaExtendidaEntity.getProducto(), garantiaExtendidaEntity.getFechaSolicitudGarantia(), garantiaExtendidaEntity.getFechaFinGarantia(), garantiaExtendidaEntity.getPrecio(), garantiaExtendidaEntity.getNombreCliente());
//		}
//		
//		return garantiaExtendida;
//		
//	}
	
//	public static GarantiaExtendidaEntity covertirAEntity(GarantiaExtendida garantiaExtendida){
//		
//		GarantiaExtendidaEntity garantiaExtendidaEntity = new GarantiaExtendidaEntity();
//		
//		garantiaExtendidaEntity.setFechaFinGarantia(garantiaExtendida.getFechaFinGarantia());
//		garantiaExtendidaEntity.setFechaSolicitudGarantia(garantiaExtendida.getFechaSolicitudGarantia());
//		garantiaExtendidaEntity.setNombreCliente(garantiaExtendida.getNombreCliente());
//		garantiaExtendidaEntity.setPrecio(garantiaExtendida.getPrecioGarantia());;
//		garantiaExtendidaEntity.setProducto(garantiaExtendida.getProducto());
//		
//		return garantiaExtendidaEntity;
//	}

}
