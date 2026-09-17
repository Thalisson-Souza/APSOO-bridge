package bridge.tamanho;

/** Novo ConcreteImplementor da Etapa 3. */
public class Tamanho1Litro implements Tamanho {
    @Override
    public String descricao() {
        return "garrafa de 1 litro";
    }

    @Override
    public int volumeEmMl() {
        return 1000;
    }

    @Override
    public String tipoEmbalagem() {
        return "garrafa";
    }
}
