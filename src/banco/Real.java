package banco;

//Classe Real que representa a moeda brasileira e estende Moeda.
public class Real extends Moeda {

    // Construtor que delega o valor para o construtor da superclasse Moeda.
    public Real(double valor) {
        super(valor);
    }

    // Implementação do método info: mostra o valor em Reais no console.
    public void info() {
        System.out.println("BRL: R$ " + valor);
    }

    // Converter: como já está em BRL, retorna o próprio valor.
    public double converter() {
        return valor;
    }
}
