package br.com.fatecararas.f290_dsm_tp2_piadasnerd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatecararas.f290_dsm_tp2_piadasnerd.model.Piada;
import br.com.fatecararas.f290_dsm_tp2_piadasnerd.repositories.PiadaRepository;

@Service
public class PiadaService {
    
    @Autowired
    private PiadaRepository repository;

    public Piada criar(Piada pPiada) throws Exception{
        //TODO: Validações
        return repository.save(pPiada);
    }

    public List<Piada> buscarTodas() {
        return repository.findAll();
    }
}
