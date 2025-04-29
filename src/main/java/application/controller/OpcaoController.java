package application.controller;

import application.model.Opcao;
import application.record.OpcaoDTO;
import application.service.OpcaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/opcoes")
public class OpcaoController {

    @Autowired
    private OpcaoService service;

    @GetMapping
    public List<OpcaoDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public OpcaoDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public OpcaoDTO save(@RequestBody Opcao opcao) {
        return service.save(opcao);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
