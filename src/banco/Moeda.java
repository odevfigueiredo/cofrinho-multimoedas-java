package banco;

public abstract class Moeda {

    // Atributo protegido 'valor' que guarda a quantia dessa moeda.
    protected double valor;

    // Construtor que inicializa o valor da moeda.
    public Moeda(double valor) {
        this.valor = valor;
    }

    // Método abstrato que as subclasses devem implementar para imprimir informações.
    public abstract void info();

    // Método abstrato que deve retornar o valor convertido para BRL.
    public abstract double converter();
}
