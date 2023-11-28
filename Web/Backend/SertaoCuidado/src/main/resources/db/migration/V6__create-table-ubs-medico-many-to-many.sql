CREATE TABLE ubs_medicos (
    ubs_id bigserial not null,
    medico_id bigserial not null,
    PRIMARY KEY (ubs_id, medico_id),
    FOREIGN KEY (ubs_id) REFERENCES ubs(id),
    FOREIGN KEY (medico_id) REFERENCES medico(id)
);
