package serdaoCuidado.SertaoCuidado.Paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import serdaoCuidado.SertaoCuidado.Endereco.DadosEndereco;
import serdaoCuidado.SertaoCuidado.QuadroClinico.DadosQuadroClinico;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
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
        boolean ativo) {
}
