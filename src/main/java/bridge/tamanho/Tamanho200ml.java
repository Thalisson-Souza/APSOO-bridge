package bridge.tamanho;

/** ConcreteImplementor para refrigerantes de 200 ml. */
public class Tamanho200ml implements Tamanho {
    @Override
    public String descricao() {
        return "lata de 200 ml";
    }

    @Override
    public int volumeEmMl() {
        return 200;
    }

    @Override
    public String tipoEmbalagem() {
        return "lata";
    }
}
