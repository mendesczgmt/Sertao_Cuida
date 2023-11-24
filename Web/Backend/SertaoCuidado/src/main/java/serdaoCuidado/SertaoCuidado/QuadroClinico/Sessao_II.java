package serdaoCuidado.SertaoCuidado.QuadroClinico;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Sessao_II {

    //hipertrofia_ventricular_esquerda
    private boolean hve;
    private boolean microalbuminuria;
    //doenca_renal_cronica_estagio3
    private boolean drc_estagio3;
    //Indice tornozelo braquial
    private boolean itb;
    //Espessura mediointimal (EMI) da carótida
    private boolean emi_da_carotida;
    private int cont2;


    public Sessao_II(DadosSessaoII dados) {
        this.hve = dados.hve();
        this.microalbuminuria = dados.microalbuminuria();
        this.drc_estagio3 = dados.drc_estagio3();
        this.itb = dados.itb();
        this.emi_da_carotida = dados.emi_da_carotida();

        boolean[] atributos = {hve, microalbuminuria, drc_estagio3, itb, emi_da_carotida};
        for (boolean atributo : atributos) {
            if (atributo) {
                cont2++;
            }
        }
    }

}
