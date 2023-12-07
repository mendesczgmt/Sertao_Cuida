package serdaoCuidado.SertaoCuidado.QuadroClinico;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Sessao_I {

    private boolean idade_de_risco;
    private boolean DCV_em_parentes_primeiro_grau;
    private boolean tabagismo;
    private boolean diabete_melica_confirmada;
    private boolean obesidade;
    private boolean dislipidemia;

    private int cont1 = 0;

    public Sessao_I(DadosSessaoI dados) {
        this.idade_de_risco = dados.idade_de_risco();
        this.DCV_em_parentes_primeiro_grau = dados.DCV_em_parentes_primeiro_grau();
        this.tabagismo = dados.tabagismo();
        this.diabete_melica_confirmada = dados.diabete_melica_confirmada();
        this.obesidade = dados.obesidade();
        this.dislipidemia = dados.dislipidemia();


        boolean[] atributos = {idade_de_risco, DCV_em_parentes_primeiro_grau, tabagismo, diabete_melica_confirmada, obesidade, dislipidemia};
        for (boolean atributo : atributos) {
            if (atributo) {
                cont1++;
            }
        }
    }

}
