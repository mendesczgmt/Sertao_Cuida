package serdaoCuidado.SertaoCuidado.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import serdaoCuidado.SertaoCuidado.Medico.Medico;
import serdaoCuidado.SertaoCuidado.Medico.MedicoDto;
import serdaoCuidado.SertaoCuidado.Medico.MedicoRepository;
import serdaoCuidado.SertaoCuidado.Medico.MedicoService;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    final MedicoService medicoService;

    public MedicoController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarMedico(@RequestBody @Valid MedicoDto medico){
        repository.save(new Medico(medico));
    }

    @GetMapping
    public Page<MedicoDto> listarMedicos(Pageable paginacao){
        return repository.findAll(paginacao).map(MedicoDto::new);
    }

     @GetMapping("/{id}")
    public ResponseEntity<Object> getMedicoById(@PathVariable(value = "id") Long id) {
        Optional<Medico> medicoOptional = medicoService.findById(id);
        if (medicoOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Medico not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(medicoOptional.get());
    } 

     @GetMapping("/nome")
    public ResponseEntity<List<Medico>> getMedicoByName(@Validated @RequestParam(value = "name") String nome) {
        return ResponseEntity.status(HttpStatus.OK).body(medicoService.findByName(nome));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteMedico(@PathVariable(value = "id") Long id) {
        Optional<Medico> medicoOptional = medicoService.findById(id);
        if (medicoOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Medico not found.");
        }
        medicoService.Delete(medicoOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Medico deleted successfully.");
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Object> updateMedico(@PathVariable(value = "id") Long id, @RequestBody Map<Object, Object> objectMap) {
        Optional<Medico> medicoOptional = medicoService.findById(id);
        if (medicoOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Medico not found.");
        }
        medicoService.partialUpdate(medicoOptional.get(), objectMap);
        return ResponseEntity.status(HttpStatus.OK).body("Medico deleted successfully.");
    }
}