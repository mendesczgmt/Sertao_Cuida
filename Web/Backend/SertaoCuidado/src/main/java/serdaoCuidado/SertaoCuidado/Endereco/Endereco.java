package serdaoCuidado.SertaoCuidado.Endereco;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import serdaoCuidado.SertaoCuidado.Paciente.Paciente;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cidade;
    private String bairro;
    private String logradouro;
    private int numero;
    @OneToOne(mappedBy = "endereco")
    private Paciente paciente;

    public Endereco(DadosEndereco dados) {
        this.cidade = dados.cidade();
        this.bairro = dados.bairro();
        this.logradouro = dados.logradouro();
        this.numero = dados.numero();
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        if(dados.cidade() != null) {
            this.cidade = dados.cidade();
        }
        if(dados.bairro() != null) {
            this.bairro = dados.bairro();
        }
        if(dados.logradouro() != null) {
            this.logradouro = dados.logradouro();
        }
        if(dados.numero() != 0) {
            this.numero = dados.numero();
        }
    }
}
