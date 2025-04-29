package application.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "opcao")
@Getter
@Setter
@NoArgsConstructor
public class Opcao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private boolean isCorreta;

    @ManyToOne
    @JoinColumn(name = "questao_id", nullable = false)
    private Questao questao;
}
