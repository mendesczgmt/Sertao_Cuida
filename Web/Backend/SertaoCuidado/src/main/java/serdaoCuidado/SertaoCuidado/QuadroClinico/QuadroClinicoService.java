package serdaoCuidado.SertaoCuidado.QuadroClinico;

import java.lang.reflect.Field;
import org.springframework.data.util.ReflectionUtils;

import org.springframework.stereotype.Service;
import serdaoCuidado.SertaoCuidado.Paciente.Paciente;

@Service
public class QuadroClinicoService {
    final QuadroClinicoRepository qdRepository;

    public QuadroClinicoService(QuadroClinicoRepository qdRepository){
        this.qdRepository = qdRepository;
    }

    public void atualizarDados(QuadroClinico quadroClinico, DadosQuadroClinico novos_dados){
        Class<?> classe = novos_dados.getClass();
        Field[] atributos = classe.getDeclaredFields();

        for(Field atributo : atributos){
            try{
                Field field = ReflectionUtils.findRequiredField(DadosQuadroClinico.class, (String) atributo.getName());
                field.setAccessible(true);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            
        }
    }

    public void calcularRisco(Paciente paciente){

    }

}
