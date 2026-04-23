package main;

public class FabricaCelularTopoDeLinha implements FabricaAbstrata {

    @Override
    public Processador createProcessador() {
        return new ProcessadorSnapdragon();
    }

    @Override
    public Memoria createMemoria() {
        return new MemoriaDDR5();
    }
}
