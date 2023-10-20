package serdaoCuidado.SertaoCuidado.UBS;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class PacienteUbs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ubs_id")
    private Ubs ubs;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;
}
