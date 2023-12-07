package serdaoCuidado.SertaoCuidado.QuadroClinico;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.util.ReflectionUtils;
import serdaoCuidado.SertaoCuidado.Paciente.Paciente;

import java.lang.reflect.Field;

import java.time.LocalDate;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "quadros_clinicos")
@Entity(name = "Quadro_Clinico")
@EqualsAndHashCode(of = "id")
public class QuadroClinico {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate data_de_emissao = LocalDate.now();
    private boolean plano_de_saude;
    private boolean hipertenso;
    private boolean insulino;
    private boolean cds;
    private double ca;
    private boolean amg;
    private boolean diabetico;
    private boolean teve_covid;
    private boolean complicacoes_covid;
    private int pas;
    private int pad;
    @Embedded
    private Sessao_I sessaoI;
    @Embedded
    private Sessao_II sessaoII;
    @Embedded
    private Sessao_III sessaoIII;
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    public QuadroClinico(DadosQuadroClinico dados) {
        this.plano_de_saude = dados.plano_de_saude();
        this.hipertenso = dados.hipertenso();
        this.insulino = dados.insulino();
        this.cds = dados.cds();
        this.ca = dados.ca();
        this.amg = dados.amg();
        this.diabetico = dados.diabetico();
        this.teve_covid = dados.teve_covid();
        this.complicacoes_covid = dados.complicacoes_covid();
        this.pas = dados.pas();
        this.pad = dados.pad();
        this.sessaoI= new Sessao_I(dados.sessaoI());
        this.sessaoII = new Sessao_II(dados.sessaoII());
        this.sessaoIII = new Sessao_III(dados.sessaoIII());

    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }


}