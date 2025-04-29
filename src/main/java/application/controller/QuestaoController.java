package application.controller;

import application.model.Questao;
import application.record.QuestaoDTO;
import application.service.QuestaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questoes")
public class QuestaoController {

    @Autowired
    private QuestaoService service;

    @GetMapping
    public List<QuestaoDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public QuestaoDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public QuestaoDTO save(@RequestBody Questao questao) {
        return service.save(questao);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
