package serdaoCuidado.SertaoCuidado.UBS;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import serdaoCuidado.SertaoCuidado.Endereco.Endereco;
import serdaoCuidado.SertaoCuidado.Medico.models.Medico;
import serdaoCuidado.SertaoCuidado.Paciente.Paciente;

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
    private List<Paciente> pacientes;
    private Endereco endereco;


    

}