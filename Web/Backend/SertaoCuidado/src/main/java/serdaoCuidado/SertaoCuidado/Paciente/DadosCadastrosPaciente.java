package serdaoCuidado.SertaoCuidado.Paciente;

import serdaoCuidado.SertaoCuidado.Endereco.DadosEndereco;
import serdaoCuidado.SertaoCuidado.QuadroClinico.DadosQuadroClinico;

public record DadosCadastrosPaciente(
        String nome,
        String cpf,
        String sexo,
        String contato,
        DadosEndereco endereco,
        double peso,
        double altura,
        double imc,
        Raca raca,
        DadosQuadroClinico quadroClinico,
        boolean ativo
        ) {

}
