package serdaoCuidado.SertaoCuidado.Controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import serdaoCuidado.SertaoCuidado.Paciente.DadosCadastrosPaciente;
import serdaoCuidado.SertaoCuidado.Paciente.DadosListagemPaciente;
import serdaoCuidado.SertaoCuidado.Paciente.Paciente;
import serdaoCuidado.SertaoCuidado.Paciente.PacienteRepository;

@RestController
@RequestMapping("paciente")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastrosPaciente dados) {
        repository.save(new Paciente(dados));
    }

    @GetMapping
    public Page<DadosListagemPaciente> listar(Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemPaciente::new);
    }
}
