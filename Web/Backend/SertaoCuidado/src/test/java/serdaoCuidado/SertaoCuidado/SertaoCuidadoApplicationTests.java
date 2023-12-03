package serdaoCuidado.SertaoCuidado;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import serdaoCuidado.SertaoCuidado.Endereco.DadosEndereco;
import serdaoCuidado.SertaoCuidado.Endereco.Endereco;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class SertaoCuidadoApplicationTests {

    @Test
    public void testEndereco() {
        DadosEndereco dados = new DadosEndereco("Patos", "BH", "Rua NaoSei", 123);
        Endereco endereco = new Endereco(dados);

        assertEquals("Patos", endereco.getCidade());
        assertEquals("BH", endereco.getBairro());
        assertEquals("Rua NaoSei", endereco.getLogradouro());
        assertEquals(123, endereco.getNumero());
    }

    @Test
    public void testAtualizarInformacoes() {
        Endereco endereco = new Endereco("Patos", "BH", "Rua NaoSei", 456);

        DadosEndereco novosDados = new DadosEndereco("Sao Mamede", null, "Rua Lins", 789);
        endereco.atualizarInformacoes(novosDados);

        assertEquals("Sao Mamede", endereco.getCidade());
        assertEquals("?", endereco.getBairro()); // O bairro não foi alterado nos novos dados
        assertEquals("Rua Lins", endereco.getLogradouro());
        assertEquals(789, endereco.getNumero());
    }
}


