<template>
    <div>
        <div class="paragrafo is-justify-content-center">
            <p>Preencha os campos com cuidado para ter um retorno preciso dos resultados</p>
        </div>
        <div class="container titulo preenchimento is-justify-content-center">
            <h1>Instrumento de Estratificação de Risco Cardiovascular</h1>
        </div>
        <form class="container ">
            <div class="columns">
                <div class="column is-four-fifths"> <label for="hipertenso">É hipertenso?</label></div>
                <div class="column ">
                    <input type="checkbox" name="hipertenso" value="Sim"> Sim
                </div>
                <div class="column">
                    <input type="checkbox" name="hipertenso" value="Não"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"> <label for="diabetico">É diabético?</label></div>
                <div class="column">
                    <input type="checkbox" name="diabetico" value="Sim"> Sim
                </div>
                <div class="column">
                    <input type="checkbox" name="diabetico" value="Não"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"> <label for="insulino">É insulino?</label></div>
                <div class="column">
                    <input type="checkbox" name="insulino" value="Sim"> Sim
                </div>
                <div class="column">
                    <input type="checkbox" name="insulino" value="Não"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"> <label for="amg">Auto monitoramento glicemico?</label></div>
                <div class="column">
                    <input type="checkbox" name="amg" value="Sim"> Sim
                </div>
                <div class="column">
                    <input type="checkbox" name="amg" value="Não"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"> <label for="covid">Teve covid?</label></div>
                <div class="column">
                    <input type="checkbox" name="covid" value="Sim"> Sim
                </div>
                <div class="column">
                    <input type="checkbox" name="covid" value="Não"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"> <label for="complicacao">Se sim, teve complicações?</label></div>
                <div class="column">
                    <input type="checkbox" name="complicacao" value="Sim"> Sim
                </div>
                <div class="column">
                    <input type="checkbox" name="complicacao" value="Não"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"> <label for="peso">Peso do Paciente (kg):</label></div>
                <div class="column">
                    <input type="number" id="peso" name="peso" min="0" step="0.1" required>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"> <label for="pressao_arterial">Pressão Arterial:</label></div>
                <div class="column">
                    <input type="number" id="pressao_arterial" name="pressao_arterial" min="0" step="0.1" required>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"> <label for="imc">IMC:</label></div>
                <div class="column">
                    <input type="number" id="imc" name="imc" min="0" step="0.1" required>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"> <label for="circunferencia_abdominal">Circunferência Abdominal
                        (cm):</label></div>
                <div class="column">
                    <input type="number" id="circunferencia_abdominal" name="circunferencia_abdominal" min="0" step="0.1"
                        required>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"> <label for="altura">Altura (m):</label></div>
                <div class="column">
                    <input type="number" id="altura" name="altura" min="0" step="0.1" required>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"> <label for="sexo">Sexo:</label></div>
                <div class="column">
                    <select id="sexo" name="sexo" required>
                        <option value="masculino">Masculino</option>
                        <option value="feminino">Feminino</option>
                    </select>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"> <label for="raca_cor">raca/cor:</label></div>
                <div class="column">
                    <select id="raca_cor" name="raca_cor" required>
                        <option value="branca">Branca</option>
                        <option value="preta">Preta</option>
                        <option value="parda">Parda</option>
                        <option value="amarela">Amarela</option>
                        <option value="indigena">Indígena</option>
                    </select>
                </div>
            </div>

            <!-- Seção 1 - Profissionais de Saúde de Nível Superior -->
            <div class="titulo preenchimento is-justify-content-center">
                <h1>Fatores de risco Cardiovascular na avaliação de risco adicional no hipertenso</h1>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"> <label for="sexo">Masculino</label></div>
                <div class="column">
                    <input type="radio" name="sexo" value="Masculino"> Sim
                </div>
                <div class="column">
                    <input type="radio" name="sexo" value="Feminino"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"> <label for="idade">Idade (homem >55 anos ou mulheres >65 anos)</label>
                </div>
                <div class="column">
                    <input type="radio" name="idade" value="Idade"> Sim
                </div>
                <div class="column">
                    <input type="radio" name="idade" value="Idade"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"> <label for="historico_dcv">Histórico de DCV prematura em parentes de
                        primeiro grau:</label></div>
                <div class="column">
                    <input type="radio" name="historico_dcv" value="historico_dcv"> Sim
                </div>
                <div class="column">
                    <input type="radio" name="historico_dcv" value="historico_dcv"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"> <label for="tabagismo">Tabagismo</label></div>
                <div class="column">
                    <input type="radio" name="tabagismo" value="tabagismo"> Sim
                </div>
                <div class="column">
                    <input type="radio" name="tabagismo" value="tabagismo"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"> <label for="diabetes">Diabetes</label></div>
                <div class="column">
                    <input type="radio" name="diabetes" value="diabetes"> Sim
                </div>
                <div class="column">
                    <input type="radio" name="diabetes" value="diabetes"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"> <label for="obesidade">Obesidade</label></div>
                <div class="column">
                    <input type="radio" name="obesidade" value="obesidade"> Sim
                </div>
                <div class="column">
                    <input type="radio" name="obesidade" value="obesidade"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"> <label for="dislipidemia">Dislipidemia: triglicerídeos > 150 mg/ dl e/ou
                        LDL-C >100
                        mg/ dl e/ou HLD-C &lt;40 mg/ dl </label></div>
                <div class="column">
                    <input type="radio" name="dislipidemia" value="dislipidemia"> Sim
                </div>
                <div class="column">
                    <input type="radio" name="dislipidemia" value="dislipidemia"> Não<br>
                </div>
            </div>


            <!-- Seção 2 - Profissional Médico / Enfermeiro -->
            <div class="titulo preenchimento is-justify-content-center">
                <h1>Lesão de Órgão Alvo</h1>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"><label for="hipertrofia_ventricular">Hipertrofia Ventricular Esquerda
                        (HVE):</label></div>
                <div class="column">
                    <input type="radio" name="hipertrofia_ventricular" value="hipertrofia_ventricular"> Sim
                </div>
                <div class="column">
                    <input type="radio" name="hipertrofia_ventricular" value="hipertrofia_ventricular"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"><label for="doenca_renal_cronica">Doença renal crônica estágio 3 (RFG-e
                        30 - 60 ml/min/1,73m²):</label></div>
                <div class="column">
                    <input type="radio" name="doenca_renal_cronica" value="doenca_renal_cronica"> Sim
                </div>
                <div class="column">
                    <input type="radio" name="doenca_renal_cronica" value="doenca_renal_cronica"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"><label for="indice_tornozelo">Índice tornozelo -braquial (ITB):
                        0,9¹</label></div>
                <div class="column">
                    <input type="radio" name="indice_tornozelo" value="indice_tornozelo"> Sim
                </div>
                <div class="column">
                    <input type="radio" name="indice_tornozelo" value="indice_tornozelo"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths"><label for="espessura_mediointimal">Espessura mediointimal (EMI) da
                        carótida: > 0,9 mm ou placa carotídea, se
                        indicado¹∙²</label></div>
                <div class="column">
                    <input type="radio" name="iespessura_mediointimal" value="iespessura_mediointimal"> Sim
                </div>
                <div class="column">
                    <input type="radio" name="iespessura_mediointimal" value="iespessura_mediointimal"> Não<br>
                </div>
            </div>

            <!-- Seção 3 - Doença Cardiovascular ou Renal estabelecida -->
            <div class="titulo preenchimento is-justify-content-center">
                <h1>Doença Cardiovascular ou Renal estabelecida</h1>
            </div>

            <div class="columns">
                <div class="column is-four-fifths">
                    <label for="ave_isquêmico">AVE isquêmico ou;</label>
                </div>
                <div class="column">
                    <input type="radio" name="ave_isquêmico" value="Sim"> Sim
                </div>
                <div class="column">
                    <input type="radio" name="ave_isquêmico" value="Não"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths">
                    <label for="hemorragia_cerebral">Hemorragia cerebral ou;</label>
                </div>
                <div class="column">
                    <input type="radio" name="hemorragia_cerebral" value="Sim"> Sim
                </div>
                <div class="column">
                    <input type="radio" name="hemorragia_cerebral" value="Não"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths">
                    <label for="ataque_isquemico">Ataque isquêmico transitório (AIT).</label>
                </div>
                <div class="column">
                    <input type="radio" name="ataque_isquemico" value="Sim"> Sim
                </div>
                <div class="column">
                    <input type="radio" name="ataque_isquemico" value="Não"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths">
                    <label for="angina_estavel">Angina estável ou instável ou;</label>
                </div>
                <div class="column">
                    <input type="radio" name="angina_estavel" value="Sim"> Sim
                </div>
                <div class="column">
                    <input type="radio" name="angina_estavel" value="Não"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths">
                    <label for="infarto_miocardio">Infarto do Miocárdio ou;</label>
                </div>
                <div class="column">
                    <input type="radio" name="infarto_miocardio" value="Sim"> Sim
                </div>
                <div class="column">
                    <input type="radio" name="infarto_miocardio" value="Não"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths">
                    <label for="revascularizacao_miocardio">Revascularização do miocardio (angioplastia ou cirurgia)
                        ou;</label>
                </div>
                <div class="column">
                    <input type="radio" name="revascularizacao_miocardio" value="Sim"> Sim
                </div>
                <div class="column">
                    <input type="radio" name="revascularizacao_miocardio" value="Não"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths">
                    <label for="clinica_insuficiencia_cardiaca">Clínica de insuficiência cardíaca e/ou fração de ejeção
                        reduzida
                        FEVE &lt; 40;</label>
                </div>
                <div class="column">
                    <input type="radio" name="clinica_insuficiencia_cardiaca" value="Sim"> Sim
                </div>
                <div class="column">
                    <input type="radio" name="clinica_insuficiencia_cardiaca" value="Não"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths">
                    <label for="doenca_arterial_periferica">Doença arterial periférica sintomática dos membros inferiores
                        ou;</label>
                </div>
                <div class="column">
                    <input type="radio" name="doenca_arterial_periferica" value="Sim"> Sim
                </div>
                <div class="column">
                    <input type="radio" name="doenca_arterial_periferica" value="Não"> Não<br>
                </div>
            </div>

            <div class="columns">
                <div class="column is-four-fifths">

                    <label for="doenca_estagio_4">Doença renal crônica estagio 4 (RFG-e 30 ml/min/1,73m²) ou albuminúria >
                        (300mg /
                        24h) ou;</label>
                </div>
                <div class="column">
                    <input type="radio" name="doenca_estagio_4" value="Sim"> Sim
                </div>
                <div class="column">
                    <input type="radio" name="doenca_estagio_4" value="Não"> Não<br>
                </div>
            </div>
            <input type="submit" value="Calcular Risco">
        </form>
    </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue';
export default defineComponent({
    name: "FCalc"
})
</script>

<style scoped>
.is-justify-content-center {
    display: flex;
}

.is-justify-content-space-between {
    display: flex;
}

.titulo {
    display: flex;
    background: linear-gradient(to right, #006CA7, #003350);
    color: white;
    height: 60px;
    margin-bottom: 15px;
}
.titulo >h1 {
    padding-top: 16px;
    display: flex;
    justify-content: center;
    color: white;
    font-size: large;
    
}

.paragrafo {
    text-align: center;
    color: #656565;
    padding-top: 20px;
}

.container{
    background-color: #D9D9D9;
    padding: 0px 10px 0px 10px;
    max-width: 50%;
    border-radius: 20px;
    box-shadow: 8px 8px 16px rgba(0, 0, 0 0.08);
}
</style>