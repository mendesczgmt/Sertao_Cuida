package serdaoCuidado.SertaoCuidado.Paciente;

public record DadosListagemPaciente(Long id, String codigo_sus,String nome, Sexo sexo, double peso, double altura, double imc) {
    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getCodigo_sus(),paciente.getNome(), paciente.getSexo(), paciente.getPeso(), paciente.getAltura(), paciente.getImc());
    }
}