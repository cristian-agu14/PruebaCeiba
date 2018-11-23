package persistencia.entitad;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import dominio.Producto;

@Entity(name = "GarantiaExtendida")
@NamedQueries({
		@NamedQuery(name = "GarantiaExtendida.findByCodigo", query = "SELECT garantia from GarantiaExtendida garantia where garantia.producto.codigo = :codigo"),
		@NamedQuery(name = "GarantiaExtendida.findByProductoAndNombreCliente", query = "SELECT garantia from GarantiaExtendida where garantia.producto.codigo = :codigo AND grantia.nombreCliente =: nombreCliente"), 
		@NamedQuery(name = "GarantiaExtendida.findByProducto", query = "SELECT garantia from GarantiaExtendida where garantia.producto2 =: producto")})
public class GarantiaExtendidaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "ID_PRODUCTO", referencedColumnName = "id")
	private ProductoEntity producto;

	private Date fechaSolicitudGarantia;

	private Date fechaFinGarantia;

	private String nombreCliente;

	private double precio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProductoEntity getProducto() {
		return producto;
	}

	public void setProducto(ProductoEntity producto) {
		this.producto = producto;
	}

	public Date getFechaSolicitudGarantia() {
		return fechaSolicitudGarantia;
	}

	public void setFechaSolicitudGarantia(Date fechaSolicitudGarantia) {
		this.fechaSolicitudGarantia = fechaSolicitudGarantia;
	}

	public Date getFechaFinGarantia() {
		return fechaFinGarantia;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public double getPrecio() {
		return precio;
	}

}
