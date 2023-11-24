package serdaoCuidado.SertaoCuidado.Paciente;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;


import lombok.Getter;
import lombok.NoArgsConstructor;
import serdaoCuidado.SertaoCuidado.Endereco.Endereco;
import serdaoCuidado.SertaoCuidado.QuadroClinico.QuadroClinico;

@Table(name = "pacientes")
@Entity(name = "Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo_sus;
    private String nome;
    private String cpf;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    private String contato;
    @Embedded
    private Endereco endereco;
    private double peso;
    private double altura;
    private double imc;
    @Enumerated(EnumType.STRING)
    private Raca raca;
    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<QuadroClinico> quadrosClinicos = new ArrayList<>();

    private boolean ativo;

    public Paciente(DadosCadastrosPaciente dados) {
        this.codigo_sus = dados.codigo_sus();
        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.sexo = dados.sexo();
        this.contato = dados.contato();
        this.endereco = new Endereco(dados.endereco());
        this.peso = dados.peso();
        this.altura = dados.altura();
        this.imc = dados.imc();
        this.raca = dados.raca();
        this.ativo = true;
    }
}