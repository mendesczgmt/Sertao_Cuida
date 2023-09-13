package serdaoCuidado.SertaoCuidado.Paciente;

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

    private String nome;
    private int cpf;
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
}
