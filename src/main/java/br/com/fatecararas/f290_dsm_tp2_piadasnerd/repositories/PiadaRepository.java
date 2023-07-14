package br.com.fatecararas.f290_dsm_tp2_piadasnerd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fatecararas.f290_dsm_tp2_piadasnerd.model.Piada;

@Repository
public interface PiadaRepository extends JpaRepository<Piada, Integer>{
    
}
