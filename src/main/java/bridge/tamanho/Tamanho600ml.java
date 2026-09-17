package bridge.tamanho;

/** ConcreteImplementor para refrigerantes de 600 ml. */
public class Tamanho600ml implements Tamanho {
    @Override
    public String descricao() {
        return "garrafa de 600 ml";
    }

    @Override
    public int volumeEmMl() {
        return 600;
    }

    @Override
    public String tipoEmbalagem() {
        return "garrafa";
    }
}
