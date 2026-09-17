package bridge.refrigerante;

import bridge.tamanho.Tamanho;

/** Nova RefinedAbstraction da Etapa 3. */
public class Guarana extends Refrigerante {
    public Guarana(Tamanho tamanho) {
        super(tamanho);
    }

    @Override
    protected String marca() {
        return "Guaraná";
    }
}
