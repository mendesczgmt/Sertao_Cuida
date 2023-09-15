package serdaoCuidado.SertaoCuidado.Endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String cidade;
    private String bairro;
    private String logradouro;
    private int numero;

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
