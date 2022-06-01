package cl.td.certificacion.dao.DTO;

import java.io.Serializable;
import java.util.Date;

public class CursoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nombre;
	private String imagen;
	private Date fec_inicio;
	private Date fec_termino;
	private Integer cupos;
	private String descripcion;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Date getFec_inicio() {
		return fec_inicio;
	}
	public void setFec_inicio(Date fec_inicio) {
		this.fec_inicio = fec_inicio;
	}
	public Date getFec_termino() {
		return fec_termino;
	}
	public void setFec_termino(Date fec_termino) {
		this.fec_termino = fec_termino;
	}
	public Integer getCupos() {
		return cupos;
	}
	public void setCupos(Integer cupos) {
		this.cupos = cupos;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public CursoDTO(Integer id, String nombre, String imagen, Date fec_inicio, Date fec_termino, Integer cupos,
			String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.imagen = imagen;
		this.fec_inicio = fec_inicio;
		this.fec_termino = fec_termino;
		this.cupos = cupos;
		this.descripcion = descripcion;
	}
	public CursoDTO(String nombre, String imagen, Date fec_inicio, Date fec_termino, Integer cupos,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.imagen = imagen;
		this.fec_inicio = fec_inicio;
		this.fec_termino = fec_termino;
		this.cupos = cupos;
		this.descripcion = descripcion;
	}
	public CursoDTO() {
		super();
	}

}
