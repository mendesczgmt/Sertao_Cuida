package serdaoCuidado.SertaoCuidado.Medico.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import serdaoCuidado.SertaoCuidado.Medico.dtos.MedicoDto;
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
    private List<Ubs> ubsList;
    
    public Medico(MedicoDto medico) {
        this.nome = medico.nome();
        this.cpf = medico.cpf();
        this.crm = medico.crm();
        this.email = medico.email();
    }


}
