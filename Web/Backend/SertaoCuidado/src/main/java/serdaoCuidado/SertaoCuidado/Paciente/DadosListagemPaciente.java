package serdaoCuidado.SertaoCuidado.Paciente;

public record DadosListagemPaciente(Long id, String codigo_sus,String nome, Sexo sexo, double peso, double altura, double imc, boolean paciete_de_risco, Risco nivel_de_risco) {
    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getCodigo_sus(),paciente.getNome(), paciente.getSexo(), paciente.getPeso(), paciente.getAltura(), paciente.getImc(), paciente.isPaciete_de_risco(), paciente.getNivel_de_risco());
    }
}