package cl.td.certificacion.dao.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curso implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column (nullable = false)
	private String nombre;
	@Column (nullable = false)
	private String imagen;
	@Column (nullable = false)
	private Date fec_inicio;
	@Column (nullable = false)
	private Date fec_termino;
	@Column (nullable = false)
	private Integer cupos;
	@Column (nullable = false)
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
	public Curso() {
		super();
	}
	public Curso(String nombre, String imagen, Date fec_inicio, Date fec_termino, Integer cupos, String descripcion) {
		super();
		this.nombre = nombre;
		this.imagen = imagen;
		this.fec_inicio = fec_inicio;
		this.fec_termino = fec_termino;
		this.cupos = cupos;
		this.descripcion = descripcion;
	}
	
}
