package test;

import main.Celular;
import main.FabricaAbstrata;
import main.FabricaCelularIntermediario;
import main.FabricaCelularTopoDeLinha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CelularTest {

    @Test
    public void deveEspecificarProcessadorSnapdragon() {
        FabricaAbstrata fabrica = new FabricaCelularTopoDeLinha();
        Celular celular = new Celular(fabrica);
        assertEquals("Processador Snapdragon", celular.especProcessador());
    }

    @Test
    public void deveEspecificarProcessadorMediatek() {
        FabricaAbstrata fabrica = new FabricaCelularIntermediario();
        Celular celular = new Celular(fabrica);
        assertEquals("Processador Mediatek", celular.especProcessador());
    }

    @Test
    public void deveEspecificarMemoriaDDR5() {
        FabricaAbstrata fabrica = new FabricaCelularTopoDeLinha();
        Celular celular = new Celular(fabrica);
        assertEquals("Memoria DDR5", celular.especMemoria());
    }

    @Test
    public void deveEspecificarMemoriaDDR4() {
        FabricaAbstrata fabrica = new FabricaCelularIntermediario();
        Celular celular = new Celular(fabrica);
        assertEquals("Memoria DDR4", celular.especMemoria());
    }
}
