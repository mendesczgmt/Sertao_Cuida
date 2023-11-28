package serdaoCuidado.SertaoCuidado.Medico;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import serdaoCuidado.SertaoCuidado.Medico.MedicoDto;
import serdaoCuidado.SertaoCuidado.UBS.Ubs;

@Table(name = "medicos")
@Entity(name = "Medico")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Medico implements Serializable{

    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String crm;
    private String email;

    @ManyToMany(mappedBy = "medicos")
    private List<Ubs> ubs;
    
    public Medico(MedicoDto medico) {
        this.nome = medico.nome();
        this.cpf = medico.cpf();
        this.crm = medico.crm();
        this.email = medico.email();
        this.ubs = medico.ubs();
    }


}
