package bridge.refrigerante;

import bridge.tamanho.Tamanho;

/** RefinedAbstraction para a marca Coca-Cola. */
public class CocaCola extends Refrigerante {
    public CocaCola(Tamanho tamanho) {
        super(tamanho);
    }

    @Override
    protected String marca() {
        return "Coca-Cola";
    }
}
