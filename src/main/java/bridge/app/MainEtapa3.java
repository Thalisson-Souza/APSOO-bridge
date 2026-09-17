package bridge.app;

import bridge.refrigerante.Guarana;
import bridge.refrigerante.Refrigerante;
import bridge.tamanho.Tamanho1Litro;

/** Demonstra as extensões independentes da Etapa 3. */
public class MainEtapa3 {
    public static void main(String[] args) {
        Refrigerante guarana1Litro = new Guarana(new Tamanho1Litro());
        guarana1Litro.servir();
    }
}
