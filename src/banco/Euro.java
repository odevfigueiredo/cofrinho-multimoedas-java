package banco;

//Classe Euro que representa a moeda EUR e estende Moeda.
public class Euro extends Moeda {

    // Construtor que inicializa o valor em euros.
    public Euro(double valor) {
        super(valor);
    }

    // Exibe informações sobre o valor em euros.
    public void info() {
        System.out.println("EUR: € " + valor);
    }

    // Converte o valor em EUR para BRL multiplicando pela taxa do euro comercial atual.
    public double converter() {
        return valor * 6.18;
    }
}
