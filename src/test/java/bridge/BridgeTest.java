package bridge;

import bridge.estoque.Estoque;
import bridge.refrigerante.CocaCola;
import bridge.refrigerante.Refrigerante;
import bridge.tamanho.Tamanho200ml;

/** Testes leves sem dependências externas; executar com a opção -ea. */
public class BridgeTest {
    public static void main(String[] args) {
        deveCombinarMarcaETamanho();
        deveControlarQuantidadeNoEstoque();
        deveRejeitarTamanhoNulo();
        System.out.println("Testes Bridge aprovados.");
    }

    private static void deveCombinarMarcaETamanho() {
        Refrigerante refrigerante = new CocaCola(new Tamanho200ml());
        assert refrigerante.descricao().equals("Coca-Cola — lata de 200 ml");
    }

    private static void deveControlarQuantidadeNoEstoque() {
        Refrigerante refrigerante = new CocaCola(new Tamanho200ml());
        Estoque estoque = new Estoque();
        estoque.adicionar(refrigerante, 2);
        estoque.servir(refrigerante);
        assert estoque.quantidadeDe(refrigerante) == 1;
    }

    private static void deveRejeitarTamanhoNulo() {
        try {
            new CocaCola(null);
            throw new AssertionError("Era esperado rejeitar tamanho nulo.");
        } catch (IllegalArgumentException esperado) {
            // Comportamento esperado.
        }
    }
}
