package application.record;

import application.model.Questao;

import java.util.List;
import java.util.stream.Collectors;

public record QuestaoDTO(
    long id,
    String enunciado,
    List<OpcaoDTO> opcoes,
    CategoriaDTO categoria
) {
    public QuestaoDTO(Questao model) {
        this(
            model.getId(),
            model.getEnunciado(),
            model.getOpcoes() != null
                ? model.getOpcoes().stream().map(OpcaoDTO::new).collect(Collectors.toList())
                : null,
            new CategoriaDTO(model.getCategoria())
        );
    }
}
