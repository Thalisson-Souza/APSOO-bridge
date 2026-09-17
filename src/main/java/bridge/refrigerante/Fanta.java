package bridge.refrigerante;

import bridge.tamanho.Tamanho;

/** RefinedAbstraction para a marca Fanta. */
public class Fanta extends Refrigerante {
    public Fanta(Tamanho tamanho) {
        super(tamanho);
    }

    @Override
    protected String marca() {
        return "Fanta";
    }
}
