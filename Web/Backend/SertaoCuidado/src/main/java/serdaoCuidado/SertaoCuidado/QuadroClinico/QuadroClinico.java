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
    private boolean plano_de_saude;
    private boolean hipertenso;
    private boolean insulino;
    private boolean cds;
    private boolean ca;
    private boolean amg;
    private boolean diabetico;
    private boolean teve_covid;
    private boolean complicacoes_covid;
    private boolean pa;

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
        this.pa = dados.pa();
    }

    public void atualizarInformacoes(DadosQuadroClinico dados) {
        if (dados.plano_de_saude() != null) {
            this.plano_de_saude = dados.plano_de_saude();
        }
    }
}
