package serdaoCuidado.SertaoCuidado.EntidadesManyToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import serdaoCuidado.SertaoCuidado.Medico.models.Medico;
import serdaoCuidado.SertaoCuidado.UBS.Ubs;

@Entity
@Table(name = "medico_ubs")
public class MedicoUbs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "ubs_id")
    private Ubs ubs;

}