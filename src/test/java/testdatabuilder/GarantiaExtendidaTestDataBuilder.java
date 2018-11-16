package testdatabuilder;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import dominio.GarantiaExtendida;
import dominio.Producto;

public class GarantiaExtendidaTestDataBuilder {

	private static final Date FECHA_SOLICITUD = new Date();
	private static final String NOMBRE_CLIENTE = "Juan Perez";

	private Date fechaSolicitud;
	private String nombreCliente;
	private Producto producto;
	private Date fechaFinGarantia;
	private double precioGarantia;

	public GarantiaExtendidaTestDataBuilder() {
		this.fechaSolicitud = FECHA_SOLICITUD;
		this.nombreCliente = NOMBRE_CLIENTE;
	}

	public GarantiaExtendidaTestDataBuilder conFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
		return this;
	}

	public GarantiaExtendidaTestDataBuilder conNombre(String nombre) {
		this.nombreCliente = nombre;
		return this;
	}

	public GarantiaExtendida buildGarantia(Producto producto) {

		LocalDate localDateFin = FECHA_SOLICITUD.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		double precioProducto = producto.getPrecio();

		if (precioProducto > 500000) {

			precioGarantia = precioProducto * 0.2;
			localDateFin.plusDays(200);
			fechaFinGarantia = Date.from(localDateFin.atStartOfDay(ZoneId.systemDefault()).toInstant());

		} else {

			precioGarantia = precioProducto * 0.1;
			localDateFin.plusDays(100);
			fechaFinGarantia = Date.from(localDateFin.atStartOfDay(ZoneId.systemDefault()).toInstant());
		}
		return new GarantiaExtendida(producto, fechaSolicitud, fechaFinGarantia, precioGarantia, nombreCliente);
	}

	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Date getFechaFinGarantia() {
		return fechaFinGarantia;
	}

	public void setFechaFinGarantia(Date fechaFinGarantia) {
		this.fechaFinGarantia = fechaFinGarantia;
	}

	public double getPrecioGarantia() {
		return precioGarantia;
	}

	public void setPrecioGarantia(double precioGarantia) {
		this.precioGarantia = precioGarantia;
	}

}
