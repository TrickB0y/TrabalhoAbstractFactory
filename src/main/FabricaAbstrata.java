package main;

public interface FabricaAbstrata {
    Processador createProcessador();
    Memoria createMemoria();
}
