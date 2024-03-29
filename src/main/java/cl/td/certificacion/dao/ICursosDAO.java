package cl.td.certificacion.dao;

import java.util.List;

import cl.td.certificacion.dao.DTO.ContenidoDTO;
import cl.td.certificacion.dao.DTO.CursoDTO;

public interface ICursosDAO {

	public List<CursoDTO> obtenerCursos();
	public CursoDTO obtenerCurso(Integer id);
	public boolean guardarCurso(CursoDTO curso);
	public boolean actualizarCurso(CursoDTO curso);
	public boolean eliminarCurso(Integer id);
	public int obtenerCupos(Integer id);
	public void guardarContenido(ContenidoDTO contenido);
	public boolean actualizarContenido(ContenidoDTO contenido);
	public boolean eliminarContenido(Integer id);
}
