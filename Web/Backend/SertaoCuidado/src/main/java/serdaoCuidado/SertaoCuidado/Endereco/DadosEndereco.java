package serdaoCuidado.SertaoCuidado.Endereco;

import jakarta.validation.constraints.NotBlank;

public record DadosEndereco(
    @NotBlank
    String cidade, 
    @NotBlank
    String bairro,
    @NotBlank 
    String logradouro, 
    int numero) {
}
