package serdaoCuidado.SertaoCuidado.QuadroClinico;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Sessao_III {

    private boolean AVE_isquêmico;
    private boolean hemorragia_cerebral;
    //Ataque isquêmico transitório
    private boolean AIT;

    private boolean angina_estável_ou_instável;
    private boolean infarto;
    private boolean revascularização;
    private boolean insuficiência_cardíaca;
    private boolean dpença_arterial_periférica_sintomática_dos_membros_inferiores;
    //doenca_renal_cronica_estagio3
    private boolean drc_estagio4;
    private boolean retinopatia_avançada;

    private int cont3 = 0;


    public Sessao_III(DadosSessaoIII dados) {
        this.AVE_isquêmico = dados.AVE_isquêmico();
        this.hemorragia_cerebral = dados.hemorragia_cerebral();
        this.AIT = dados.AIT();
        this.angina_estável_ou_instável = dados.angina_estável_ou_instável();
        this.infarto = dados.infarto();
        this.revascularização = dados.revascularização();
        this.insuficiência_cardíaca = dados.insuficiência_cardíaca();
        this.dpença_arterial_periférica_sintomática_dos_membros_inferiores = dados.dpença_arterial_periférica_sintomática_dos_membros_inferiores();
        this.drc_estagio4 = dados.drc_estagio4();
        this.retinopatia_avançada = dados.retinopatia_avançada();


        boolean[] atributos = {
                AVE_isquêmico, hemorragia_cerebral, AIT, angina_estável_ou_instável,
                infarto, revascularização, insuficiência_cardíaca,
                dpença_arterial_periférica_sintomática_dos_membros_inferiores, drc_estagio4,
                retinopatia_avançada
        };
        for (boolean atributo : atributos) {
            if (atributo) {
                cont3++;
            }
        }
    }

}