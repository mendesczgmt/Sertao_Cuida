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
}
