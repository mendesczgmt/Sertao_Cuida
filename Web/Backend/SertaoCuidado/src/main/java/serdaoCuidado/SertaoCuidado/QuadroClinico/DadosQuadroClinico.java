package serdaoCuidado.SertaoCuidado.QuadroClinico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DadosQuadroClinico(


        @NotNull
        boolean plano_de_saude,
        @NotNull
        boolean hipertenso,
        @NotNull
        boolean insulino,
        @NotNull
        boolean cds,
        @NotNull
        double ca,
        @NotNull
        boolean amg,
        @NotNull
        boolean diabetico,
        @NotNull
        boolean teve_covid,
        @NotNull
        boolean complicacoes_covid,
        @NotNull
        int pas,
        @NotNull
        int pad,
        @Valid
        DadosSessaoI sessaoI,
        @Valid
        DadosSessaoII sessaoII,
        @Valid
        DadosSessaoIII sessaoIII
        ) {
}
