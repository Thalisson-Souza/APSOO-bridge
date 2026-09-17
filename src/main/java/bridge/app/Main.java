package bridge.app;

import bridge.estoque.Estoque;
import bridge.refrigerante.CocaCola;
import bridge.refrigerante.Fanta;
import bridge.refrigerante.Refrigerante;
import bridge.refrigerante.Sprite;
import bridge.tamanho.Tamanho200ml;
import bridge.tamanho.Tamanho300ml;
import bridge.tamanho.Tamanho600ml;

public class Main {
    public static void main(String[] args) {
        Refrigerante cocaCola = new CocaCola(new Tamanho200ml());
        demonstrar("Coca-Cola 200 ml", cocaCola);
        demonstrar("Fanta 300 ml", new Fanta(new Tamanho300ml()));
        demonstrar("Sprite 600 ml", new Sprite(new Tamanho600ml()));

        Estoque estoque = new Estoque();
        estoque.adicionar(cocaCola, 2);
        estoque.servir(cocaCola);
        System.out.println("Quantidade restante de " + cocaCola.descricao()
                + ": " + estoque.quantidadeDe(cocaCola));
    }

    private static void demonstrar(String titulo, Refrigerante refrigerante) {
        System.out.println("=== " + titulo + " ===");
        refrigerante.servir();
        System.out.println();
    }
}
