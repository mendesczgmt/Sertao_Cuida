package serdaoCuidado.SertaoCuidado.Paciente;

import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;


import lombok.Getter;
import lombok.NoArgsConstructor;
import serdaoCuidado.SertaoCuidado.Endereco.Endereco;
import serdaoCuidado.SertaoCuidado.QuadroClinico.QuadroClinico;
import serdaoCuidado.SertaoCuidado.UBS.Ubs;

@Table(name = "paciente")
@Entity(name = "Pacientes")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String sexo;
    private String contato;

    @OneToOne
    @JoinColumn(name = "endereco_id", unique = true)
    private Endereco endereco;
    private double peso;
    private double altura;
    private double imc;

    @Enumerated(EnumType.STRING)
    private Raca raca;

    @OneToOne
    @JoinColumn(name = "quadroclinico_id", unique = true)
    private QuadroClinico quadroClinico;

    private boolean ativo;
    @ManyToMany(mappedBy = "medicos")
    private List<Ubs> ubsList;

    public Paciente(DadosCadastrosPaciente dados) {
        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.sexo = dados.sexo();
        this.contato = dados.contato();
        this.endereco = new Endereco(dados.endereco());
        this.peso = dados.peso();
        this.altura = dados.altura();
        this.imc = dados.imc();
        this.raca = dados.raca();
        this.quadroClinico = new QuadroClinico(dados.quadroClinico());
        this.ativo = true;
    }

    public void atualizarInformacoes(DadosAtualizacaoPaciente dados) {
        if(dados.nome() != null) {
            this.nome = dados.nome();
        }
        if(dados.cpf() != null) {
            this.cpf = dados.cpf();
        }
        if(dados.sexo() != null) {
            this.sexo = dados.sexo();
        }
        if(dados.contato() != null) {
            this.contato = dados.contato();
        }
        if(dados.endereco() != null) {
            this.endereco.atualizarInformacoes(dados.endereco());
        }
        if(dados.peso() != 0 ) {
            this.peso = dados.peso();
        }
        if(dados.altura() != 0) {
            this.altura = dados.altura();
        }
        if(dados.imc() != 0) {
            this.imc = dados.imc();
        }
        if(dados.raca() != null) {
            this.raca = dados.raca();
        }
        if(dados.quadroClinico() != null) {
            this.quadroClinico.atualizarInformacoes(dados.quadroClinico());
        }

    }
}
