package cl.td.certificacion.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.td.certificacion.dao.entity.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
