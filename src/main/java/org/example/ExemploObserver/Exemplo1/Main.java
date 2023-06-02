package org.example.ExemploObserver.Exemplo1;

public class Main {
    public static void main(String[] args) {
        Subject naveJ = new NaveJogador();
        Observer naveInimiga1 = new NaveInimiga("naveInimiga1", naveJ);
        naveJ.adAcoes(Acoes.VIRAR_ESQ);

        Observer naveInimiga2 = new NaveInimiga("naveInimiga2", naveJ);
        Observer naveInimiga3 = new NaveInimiga("naveInimiga3", naveJ);
        naveJ.adAcoes(Acoes.VIRAR_DIR);
    }
}
