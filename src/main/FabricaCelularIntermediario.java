package main;

public class FabricaCelularIntermediario implements FabricaAbstrata {

    @Override
    public Processador createProcessador() {
        return new ProcessadorMediatek();
    }

    @Override
    public Memoria createMemoria() {
        return new MemoriaDDR4();
    }
}
