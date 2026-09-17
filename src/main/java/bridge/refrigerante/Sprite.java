package bridge.refrigerante;

import bridge.tamanho.Tamanho;

/** RefinedAbstraction para a marca Sprite. */
public class Sprite extends Refrigerante {
    public Sprite(Tamanho tamanho) {
        super(tamanho);
    }

    @Override
    protected String marca() {
        return "Sprite";
    }
}
