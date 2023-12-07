package serdaoCuidado.SertaoCuidado.Controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import serdaoCuidado.SertaoCuidado.Paciente.Paciente;
import serdaoCuidado.SertaoCuidado.Paciente.PacienteRepository;
import serdaoCuidado.SertaoCuidado.QuadroClinico.DadosQuadroClinico;
import serdaoCuidado.SertaoCuidado.QuadroClinico.QuadroClinico;
import serdaoCuidado.SertaoCuidado.QuadroClinico.QuadroClinicoRepository;
import serdaoCuidado.SertaoCuidado.QuadroClinico.QuadroClinicoService;

import java.util.Optional;

@RestController
@RequestMapping("quadro_clinico")
public class QuadroClinicoController {

    @Autowired
    private QuadroClinicoRepository qdrepository;
    @Autowired
    private PacienteRepository repository;
    private QuadroClinicoService qdservice;

    @PostMapping()
    @Transactional
    public ResponseEntity<Object> novoQuadroClinico(@RequestBody @Valid DadosQuadroClinico dados, @RequestParam Long paciente_id){
        Optional<Paciente> pacienteOptional = repository.findById(paciente_id);
        if (pacienteOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Paciente not found.");
        }
        Paciente paciente = pacienteOptional.get();
        QuadroClinico quadroClinico = new QuadroClinico(dados);
        quadroClinico.setPaciente(paciente);
        paciente.getQuadrosClinicos().add(quadroClinico);
        qdrepository.save(quadroClinico);
        return ResponseEntity.status(HttpStatus.OK).body("Novo Quadro Clinico Cadastrado.");
    }

    @PostMapping("atualizar_sessao")
    @Transactional
    public ResponseEntity<Object> atualizarSessoes(@RequestBody @Valid DadosQuadroClinico dados, @RequestParam Long paciente_id, @RequestParam Long qc_id) {
        Optional<Paciente> pacienteOptional = repository.findById(paciente_id);
        if (pacienteOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Paciente not found.");
        }
        Paciente paciente = pacienteOptional.get();
        Optional<QuadroClinico> quadroClinicoOptional = paciente.getQuadrosClinicos().stream()
                .filter(quadroClinico -> quadroClinico.getId().equals(qc_id))
                .findFirst();

        if (quadroClinicoOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Quadro Clínico not found.");
        }

        QuadroClinico quadroClinico = quadroClinicoOptional.get();

        qdservice.atualizarDados(quadroClinico, dados);
        repository.save(paciente); 
        return ResponseEntity.ok("Atualização bem-sucedida");
        
    }
}
