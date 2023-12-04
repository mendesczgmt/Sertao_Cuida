package serdaoCuidado.SertaoCuidado.Medico.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import serdaoCuidado.SertaoCuidado.Medico.models.Medico;

public record MedicoDto(
        @NotBlank
    String nome, 
    @NotBlank
    @Pattern(regexp = "\\d{4,6}")
    String crm, 
    @NotBlank
    String cpf,
    @NotBlank
    @Email
    String email) {
    
        public MedicoDto(Medico medico){
            this(medico.getNome(), medico.getEmail(), medico.getCpf(), medico.getCrm());
        }
}
