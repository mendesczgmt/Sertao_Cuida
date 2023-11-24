package serdaoCuidado.SertaoCuidado.Endereco;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import serdaoCuidado.SertaoCuidado.Paciente.Paciente;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
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
