package br.com.fatecararas.f290_dsm_tp2_piadasnerd.services;

import java.util.List;
import java.util.Objects;
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
        if (Objects.isNull(piada.getId())) {
            throw new RuntimeException("Id é obrigatório para atualizar piada.");
        }

        Optional<Piada> optional = repository.findById(piada.getId());

        if (optional.isEmpty()) {
            throw new RuntimeException(String.format("Id: %s não localizado.", piada.getId()));
        }

        Piada novaPiada = optional.get();
        novaPiada.setDescricao(piada.getDescricao());
        novaPiada.setResposta(piada.getResposta());
        novaPiada.setPossuiResposta(piada.isPossuiResposta());

        repository.save(novaPiada);

    }

    public List<Piada> buscar(String termo) {
        List<Piada> piadas = repository.findByDescricao(termo);

        if (piadas.isEmpty()) {
            throw new RuntimeException(String.format("Termo não localizado(s): %s", termo));
        }

        return piadas;
    }
}
