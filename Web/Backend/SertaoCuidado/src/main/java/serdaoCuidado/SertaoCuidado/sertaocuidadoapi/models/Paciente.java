package serdaoCuidado.SertaoCuidado.sertaocuidadoapi.models;

import java.io.Serializable;

@Table('medicos');
@Entity('medico')
public class Paciente implements Serializable{

    private Long id;
    private String nome;
    private String crm;
    private String cpf;
    private String email;

    
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
