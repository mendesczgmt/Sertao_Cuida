CREATE TABLE ubs_pacientes (
    ubs_id bigserial not null,
    paciente_id bigserial not null,
    PRIMARY KEY (ubs_id, paciente_id),
    FOREIGN KEY (ubs_id) REFERENCES ubs(id),
    FOREIGN KEY (paciente_id) REFERENCES pacientes(id)
);
