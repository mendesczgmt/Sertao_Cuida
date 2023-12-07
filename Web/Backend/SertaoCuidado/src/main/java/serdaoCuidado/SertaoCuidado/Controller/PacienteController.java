package serdaoCuidado.SertaoCuidado.Controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import serdaoCuidado.SertaoCuidado.Paciente.*;
import serdaoCuidado.SertaoCuidado.QuadroClinico.*;


@RestController
@RequestMapping("paciente")
public class PacienteController {

    @Autowired
    private QuadroClinicoRepository qdrepository;
    @Autowired
    private PacienteRepository repository;

    @PostMapping("cadastrar")
    @Transactional
    public void cadastrar(@RequestBody DadosCadastrosPaciente dados) {
        Paciente paciente = new Paciente(dados);
        QuadroClinico quadroClinico = new QuadroClinico(dados.quadroClinico());
        quadroClinico.setPaciente(paciente);
        paciente.getQuadrosClinicos().add(quadroClinico);
        repository.save(paciente);
        qdrepository.save(quadroClinico);
    }


    @GetMapping
    public Page<DadosListagemPaciente> listar(Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemPaciente::new);
    }


}
