package serdaoCuidado.SertaoCuidado.UBS;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import serdaoCuidado.SertaoCuidado.Medico.Medico;
import serdaoCuidado.SertaoCuidado.Paciente.Paciente;

import java.util.List;


public record DadosCadastroUbs(

        @NotBlank
        Long id,
        @NotBlank
        String nome,
        @Valid
        List<Medico> medicos,
        @Valid
        List<Paciente> pacientes

        ) {

        
}
