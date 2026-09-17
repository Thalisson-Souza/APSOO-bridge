package bridge.refrigerante;

import bridge.tamanho.Tamanho;

/** Abstraction do padrão Bridge. */
public abstract class Refrigerante {
    protected final Tamanho tamanho;

    protected Refrigerante(Tamanho tamanho) {
        if (tamanho == null) {
            throw new IllegalArgumentException("O tamanho é obrigatório.");
        }
        this.tamanho = tamanho;
    }

    protected abstract String marca();

    public void servir() {
        System.out.println("Refrigerante servido: " + marca() + " — " + tamanho.descricao() + ".");
    }
}
