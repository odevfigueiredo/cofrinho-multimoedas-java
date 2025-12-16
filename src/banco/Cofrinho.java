package banco;

//Importa ArrayList para armazenar a coleção de moedas.
import java.util.ArrayList;

//Declara a classe Cofrinho responsável por armazenar e operar sobre moedas.
public class Cofrinho {

 // Declara um ArrayList que guardará todas as moedas.
 ArrayList<Moeda> listaMoedas = new ArrayList<>();

 // Método público para adicionar uma moeda ao cofrinho.
 public void adicionar(Moeda moeda) {
     listaMoedas.add(moeda);
 }

 // Método público para remover uma moeda; usa lógica que compara classe e valor.
 public boolean remover(Moeda moeda) {
 	return listaMoedas.removeIf(moedaTipo -> moedaTipo.getClass().equals(moeda.getClass()) && moedaTipo.valor == moeda.valor);
 }

 // Método que lista no console todas as moedas presentes no cofrinho.
 public void listagemMoedas() {
 	
     // Se a lista estiver vazia, informa ao usuário e retorna.
     if (listaMoedas.isEmpty()) {
         System.out.println("Nenhuma moeda adicionada.");
         return;
     }
     
     // Percorre cada moeda da lista e chama seu método info() para exibir detalhes.
     for (Moeda moeda : listaMoedas) {
         moeda.info();
     }
 }

 // Método que calcula o total convertido para Real (BRL) usando o método converter() de cada moeda.
 public double totalConvertido() {
 	
     // Inicializa acumulador de total.
     double total = 0;
     
     // Para cada moeda na lista, soma o valor convertido para BRL.
     for (Moeda moeda : listaMoedas) {
         total += moeda.converter();
     }
     
     // Retorna o total convertido.
     return total;
     
 }
}
