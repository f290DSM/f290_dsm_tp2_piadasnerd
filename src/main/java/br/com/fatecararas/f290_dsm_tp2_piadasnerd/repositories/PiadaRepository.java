package br.com.fatecararas.f290_dsm_tp2_piadasnerd.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.fatecararas.f290_dsm_tp2_piadasnerd.model.Piada;

@Repository
public interface PiadaRepository extends JpaRepository<Piada, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM piadas p WHERE LOWER(p.descricao) LIKE LOWER(CONCAT('%',:descricao,'%'))")
    List<Piada> findByDescricao(String descricao);
}
