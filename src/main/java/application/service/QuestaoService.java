package application.service;

import application.model.Questao;
import application.record.QuestaoDTO;
import application.repository.QuestaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestaoService {

    @Autowired
    private QuestaoRepository repository;

    public List<QuestaoDTO> findAll() {
        return repository.findAll().stream().map(QuestaoDTO::new).toList();
    }

    public QuestaoDTO findById(Long id) {
        return new QuestaoDTO(repository.findById(id).orElseThrow());
    }

    public QuestaoDTO save(Questao questao) {
        return new QuestaoDTO(repository.save(questao));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
