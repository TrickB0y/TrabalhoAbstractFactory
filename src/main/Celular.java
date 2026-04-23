package main;

public class Celular {
    private Processador processador;
    private Memoria memoria;

    public Celular(FabricaAbstrata fabrica) {
        this.processador = fabrica.createProcessador();
        this.memoria = fabrica.createMemoria();
    }

    public String especProcessador() {
        return this.processador.especificacao();
    }

    public String especMemoria() {
        return this.memoria.especificacao();
    }
}
