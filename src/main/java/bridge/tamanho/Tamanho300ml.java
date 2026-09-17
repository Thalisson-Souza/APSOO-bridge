package bridge.tamanho;

/** ConcreteImplementor para refrigerantes de 300 ml. */
public class Tamanho300ml implements Tamanho {
    @Override
    public String descricao() {
        return "lata de 300 ml";
    }

    @Override
    public int volumeEmMl() {
        return 300;
    }

    @Override
    public String tipoEmbalagem() {
        return "lata";
    }
}
