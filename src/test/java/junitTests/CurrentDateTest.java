package junitTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.CurrentDate;

@Tag("MARV")
public class CurrentDateTest {
// váriaveis com a data atual de hoje

    String diaMesAno = "02/12/2023";
    String dataExtenso = "sábado, 2 de dezembro de 2023";
    CurrentDate cd = new CurrentDate();

    //teste pra verificar se a data em formado dia/mês/ano está retornando corretamente
    @Test
    public void testVerificarDataAtual() {
        System.out.println("testVerificarDataAtual = Passou");
        String verificar = cd.verificarData();
        assertEquals(diaMesAno, verificar);
    }

    //teste pra verificar se a data em formado dia/mês/ano está retornando corretamente
    @Test
    public void testVerificarDataExtenso() {
        System.out.println("testVerificarDataExtenso = Passou");
        String verificar = cd.verificarDataCompleta();
        assertEquals(dataExtenso, verificar);
    }
}
