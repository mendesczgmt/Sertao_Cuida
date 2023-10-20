import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "ubs")
@Entity(name = "Ubs")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Ubs{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @ManyToMany
    @JoinTable(
        name = "medico_ubs",
        joinColumns = @JoinColumn(name = "ubs_id"),
        inverseJoinColumns = @JoinColumn(name = "medico_id")
    )
    private List<Medico> medicos;
    private Medico medico;
    @ManyToMany
    @JoinTable(
        name = "ubs_paciente",
        joinColumns = @JoinColumn(name = "ubs_id"),
        inverseJoinColumns = @JoinColumn(name = "paciente_id")
    )
    private Paciente Paciente;
    private Endereco endereco;


    public Medico(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.agenda = new Agenda(dados.agenda());



    }

}