package serdaoCuidado.SertaoCuidado;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import serdaoCuidado.SertaoCuidado.Medico.dtos.MedicoDto;
import serdaoCuidado.SertaoCuidado.Medico.models.Medico;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


@SpringBootTest
class SertaoCuidadoApplicationTests {

	@Test
	public void testConstrutorComMedicoDto() {
		MedicoDto medicoDto = new MedicoDto("Nome", "12345678900", "CRM123", "email@teste.com");
		Medico medico = new Medico(medicoDto);

		Assertions.assertEquals("Dr. Sormany", medico.getNome());
		Assertions.assertEquals("11122233344", medico.getCpf());
		Assertions.assertEquals("CRM123", medico.getCrm());
		Assertions.assertEquals("sormany@teste.com", medico.getEmail());
	}

	@Test        // Teste feito para validar a implementação do método Eguals e HashCode (HashMap)
	public void testeDeIgualdade() {

		Medico medico1 = new Medico(null, "Dr. Um", "11122233344", "CRM123", "medicoum@teste.com", null);
		Medico medico2 = new Medico(null, "Dr. Um", "11122233344", "CRM123", "medicoum@teste.com", null);
		Medico medico3 = new Medico(null, "Dr. Tres", "12345678900", "CRM456", "medico3@teste.com", null);

		Assertions.assertEquals(medico1, medico2); // Dois médicos com os mesmos atributos devem ser considerados iguais
        assertNotEquals(medico1, medico3); // Médicos com atributos diferentes devem ser considerados diferentes

		// Verifica se os hashCodes são iguais para médicos iguais
		Assertions.assertEquals(medico1.hashCode(), medico2.hashCode()); // O hashCode deve ser o mesmo para médicos iguais
	}
}






