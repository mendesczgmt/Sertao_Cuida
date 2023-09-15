package serdaoCuidado.SertaoCuidado.Paciente;

public record DadosListagemPaciente(Long id,String nome, String sexo, double peso, double altura, double imc) {
    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getId(),paciente.getNome(), paciente.getSexo(), paciente.getPeso(), paciente.getAltura(), paciente.getImc());
    }
}