package br.com.fatecararas.f290_dsm_tp2_piadasnerd.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatecararas.f290_dsm_tp2_piadasnerd.model.Piada;
import br.com.fatecararas.f290_dsm_tp2_piadasnerd.repositories.PiadaRepository;

@Service
public class PiadaService {

    @Autowired
    private PiadaRepository repository;

    public Piada criar(Piada pPiada) throws Exception {
        // TODO: Validações
        return repository.save(pPiada);
    }

    public List<Piada> buscarTodas() {
        return repository.findAll();
    }

    public Piada buscarPorId(Integer id) {
        Optional<Piada> optional = repository.findById(id);

        if (optional.isEmpty()) {
            throw new RuntimeException(String.format("Id: %s não localizado.", id));
        }

        return optional.get();
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }

    public void atualizar(Piada piada) {
        //TODO: Implementar atualização...
    }
}
