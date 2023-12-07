package serdaoCuidado.SertaoCuidado.UBS;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import serdaoCuidado.SertaoCuidado.Medico.Medico;
import serdaoCuidado.SertaoCuidado.Paciente.Paciente;

import java.util.List;


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
            name = "ubs_medicos",
            joinColumns = @JoinColumn(name = "ubs_id"),
            inverseJoinColumns = @JoinColumn(name = "medico_id"))
    private List<Medico> medicos;
    @ManyToMany
    @JoinTable(
            name = "ubs_pacientes",
            joinColumns = @JoinColumn(name = "ubs_id"),
            inverseJoinColumns = @JoinColumn(name = "paciente_id"))
    private List<Paciente> pacientes;

    public void Ubs(DadosCadastroUbs ubs){
        this.nome = ubs.nome();
        this.medicos = ubs.medicos();
        this.pacientes = ubs.pacientes();
    }
}

