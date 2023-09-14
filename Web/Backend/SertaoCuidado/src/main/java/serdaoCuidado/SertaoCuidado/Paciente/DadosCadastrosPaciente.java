package serdaoCuidado.SertaoCuidado.Paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import serdaoCuidado.SertaoCuidado.Endereco.DadosEndereco;
import serdaoCuidado.SertaoCuidado.QuadroClinico.DadosQuadroClinico;

public record DadosCadastrosPaciente(

        @NotBlank
        String nome,
        @NotBlank
        @Pattern(regexp = "\\d{11,14}")
        String cpf,
        String sexo,
        @NotBlank
        String contato,
        @NotNull
        @Valid
        DadosEndereco endereco,
        double peso,
        double altura,
        double imc,
        Raca raca,
        @NotNull
        @Valid
        DadosQuadroClinico quadroClinico,
        boolean ativo
        ) {

}
