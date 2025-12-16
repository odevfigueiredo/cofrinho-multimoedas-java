package banco;

//Classe Dolar que representa a moeda USD e estende Moeda.
public class Dolar extends Moeda {

    // Construtor que inicializa o valor em dólares.
    public Dolar(double valor) {
        super(valor);
    }

    // Exibe informações sobre o valor em dólares.
    public void info() {
        System.out.println("USD: $ " + valor);
    }

    // Converte o valor em USD para BRL multiplicando pela taxa atual do dólar comercial.
    public double converter() {
        return valor * 5.31;
    }
}
