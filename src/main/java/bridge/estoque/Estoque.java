package bridge.estoque;

import bridge.refrigerante.Refrigerante;
import java.util.HashMap;
import java.util.Map;

/** Controle simples de quantidade para demonstrar o cenário de estoque. */
public class Estoque {
    private final Map<String, Integer> quantidades = new HashMap<>();

    public void adicionar(Refrigerante refrigerante, int quantidade) {
        validarQuantidade(quantidade);
        quantidades.merge(refrigerante.descricao(), quantidade, Integer::sum);
    }

    public boolean disponivel(Refrigerante refrigerante) {
        return quantidades.getOrDefault(refrigerante.descricao(), 0) > 0;
    }

    public void servir(Refrigerante refrigerante) {
        if (!disponivel(refrigerante)) {
            throw new IllegalStateException("Produto indisponível: " + refrigerante.descricao());
        }
        quantidades.compute(refrigerante.descricao(), (produto, quantidade) -> quantidade - 1);
        refrigerante.servir();
    }

    public int quantidadeDe(Refrigerante refrigerante) {
        return quantidades.getOrDefault(refrigerante.descricao(), 0);
    }

    private void validarQuantidade(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser positiva.");
        }
    }
}
