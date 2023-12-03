package serdaoCuidado.SertaoCuidado.Paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;


import lombok.Getter;
import lombok.NoArgsConstructor;
import serdaoCuidado.SertaoCuidado.Endereco.Endereco;
import serdaoCuidado.SertaoCuidado.QuadroClinico.QuadroClinico;

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

    @Embedded
    private Endereco endereco;
    private double peso;
    private double altura;
    private double imc;

    @Enumerated(EnumType.STRING)
    private Raca raca;

    @Embedded
    private QuadroClinico quadroClinico;

    private boolean ativo;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public String getContato() {
        return contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getImc() {
        return imc;
    }

    public Raca getRaca() {
        return raca;
    }

    public QuadroClinico getQuadroClinico() {
        return quadroClinico;
    }

    public boolean isAtivo() {
        return ativo;
    }

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
