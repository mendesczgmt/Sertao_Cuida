package serdaoCuidado.SertaoCuidado.QuadroClinico;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class QuadroClinico {
    private boolean PlanoDeSaude;
    private boolean hipertenso;
    private boolean insulino;
    private boolean cds;
    private boolean ca;
    private boolean amg;
    private boolean diabetico;
    private boolean teveCovid;
    private boolean complicacoesCovid;
    private boolean pa;

    public QuadroClinico(DadosQuadroClinico dados) {
        this.PlanoDeSaude = dados.PlanoDeSaude();
        this.hipertenso = dados.hipertenso();
        this.insulino = dados.insulino();
        this.cds = dados.cds();
        this.ca = dados.ca();
        this.amg = dados.amg();
        this.diabetico = dados.diabetico();
        this.teveCovid = dados.teveCovid();
        this.complicacoesCovid = dados.complicacoesCovid();
        this.pa = dados.pa();
    }

}
