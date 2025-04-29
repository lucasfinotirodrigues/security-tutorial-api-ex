package application.service;

import application.model.Opcao;
import application.record.OpcaoDTO;
import application.repository.OpcaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpcaoService {

    @Autowired
    private OpcaoRepository repository;

    public List<OpcaoDTO> findAll() {
        return repository.findAll().stream().map(OpcaoDTO::new).toList();
    }

    public OpcaoDTO findById(Long id) {
        return new OpcaoDTO(repository.findById(id).orElseThrow());
    }

    public OpcaoDTO save(Opcao opcao) {
        return new OpcaoDTO(repository.save(opcao));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
