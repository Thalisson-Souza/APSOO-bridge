package bridge.app;

import bridge.refrigerante.CocaCola;
import bridge.refrigerante.Fanta;
import bridge.refrigerante.Refrigerante;
import bridge.refrigerante.Sprite;
import bridge.tamanho.Tamanho200ml;
import bridge.tamanho.Tamanho300ml;
import bridge.tamanho.Tamanho600ml;

public class Main {
    public static void main(String[] args) {
        demonstrar("Coca-Cola 200 ml", new CocaCola(new Tamanho200ml()));
        demonstrar("Fanta 300 ml", new Fanta(new Tamanho300ml()));
        demonstrar("Sprite 600 ml", new Sprite(new Tamanho600ml()));
    }

    private static void demonstrar(String titulo, Refrigerante refrigerante) {
        System.out.println("=== " + titulo + " ===");
        refrigerante.servir();
        System.out.println();
    }
}
