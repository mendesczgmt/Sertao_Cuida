package serdaoCuidado.SertaoCuidado.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import serdaoCuidado.SertaoCuidado.Paciente.DadosCadastrosPaciente;
import serdaoCuidado.SertaoCuidado.Paciente.Paciente;
import serdaoCuidado.SertaoCuidado.Paciente.PacienteRepository;

@RestController
@RequestMapping("paciente")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastrosPaciente dados) {
        repository.save(new Paciente(dados));

    }
}
