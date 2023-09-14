package serdaoCuidado.SertaoCuidado.QuadroClinico;

public record DadosQuadroClinico(
        boolean plano_de_saude,
        boolean hipertenso,
        boolean insulino,
        boolean cds,
        boolean ca,
        boolean amg,
        boolean diabetico,
        boolean teve_covid,
        boolean complicacoes_covid,
        boolean pa
        ) {
}
