package serdaoCuidado.SertaoCuidado.sertaocuidadoapi.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import serdaoCuidado.SertaoCuidado.sertaocuidadoapi.models.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{
    
    Optional<Medico> findById(Long id);
    void delete(Medico medico);
    @Query("SELECT m FROM Medico m WHERE m.nome = :nome")
    List<Medico> findByName(@Param("nome") String nome);
}
