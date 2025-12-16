package banco;

//Importa a classe Scanner para ler entradas do usuário via console.
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        // Chama o menu principal que mantém a aplicação em execução até o usuário decidir a opção 5 que é sair.
        menuPrincipal();
	}
	
    // Cria uma instância estática de Cofrinho para ser usada por toda a aplicação.
    static Cofrinho cofre = new Cofrinho();

    // Cria um Scanner estático que lê o que for digitado a seguir pelo usuário.
    static Scanner tecla = new Scanner(System.in);
    
    // Método que exibe o menu principal e processa as opções do usuário.
    private static void menuPrincipal() {
        // Loop infinito (sai quando o usuário escolhe a opção 5 "Sair").
        while (true) {
            System.out.println("-------------- MENU BANCO FIGUEIREDO --------------");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total convertido em Real (BRL)");
            System.out.println("5 - Sair");
            System.out.print("Digite um número que corresponda as opções acima: ");
            // Lê a opção escolhida pelo usuário como INTeiro.
            int opcao = tecla.nextInt();

            // Se o usuário escolher 1, chama o menu para adicionar moedas.
            if (opcao == 1) {
                menuAdicionar();
            }
            // Se escolher 2, chama o menu para remover moedas.
            else if (opcao == 2) {
                menuRemover();
            }
            
            // Se escolher 3, pede ao cofrinho para listar as moedas armazenadas.
            else if (opcao == 3) {
                System.out.println("---------------------------------------------------");
                System.out.println("\nMostrando valores individuais e tipos: ");
                cofre.listagemMoedas();
                System.out.println("\n");
            }
            
            // Se escolher 4, calcula e mostra o total convertido para Real(BRL).
            else if (opcao == 4) {
                System.out.println("---------------------------------------------------");
                System.out.println("\nVocê escolheu CALCULAR TOTAL.");
                System.out.println("Somando todas moedas convertendo para Real...");
                System.out.printf("TOTAL EM BRL: R$ %.2f", cofre.totalConvertido());
                System.out.println("\n");
            }
            
            // Se escolher 5, fecha o Banco.
            else if (opcao == 5) {
                System.out.println("---------------------------------------------------");
                System.out.println("\nEncerrando o banco...");
                System.out.println("Obrigado pela preferência e volte sempre!\n");
                System.exit(0);
                break;
            }
            
            // Caso digite errado o valor entre as opções 1 a 5, retorna o Menu.
            else{
                System.out.println("---------------------------------------------------");
                System.out.println("\nOpção inválida.");
                System.out.println("Tente novamente digitando um número entre 1 e 5.\n");
            }
        }
    }

    // Método para adicionar uma moeda ao cofrinho.
    private static void menuAdicionar() {
        System.out.println("-------------- MENU ADICIONAR MOEDA ---------------");
        System.out.println("1 - Real (BRL)");
        System.out.println("2 - Dólar (USD)");
        System.out.println("3 - Euro (EUR)");
        System.out.print("Escolha: ");

        // Lê o tipo escolhido (1 a 3).
        int tipo = tecla.nextInt();

        // Solicita o valor da moeda a adicionar.
        System.out.print("Digite o valor: ");
        
        // Lê o valor como double (aceita casas decimais).
        double quantia = tecla.nextDouble();

        // Valida se o valor é positivo; se não for, cancela a operação.
        if (quantia <= 0) {
        	System.out.println("---------------------------------------------------");
            System.out.println("\nValor inválido. Operação cancelada.\n");
            return;
        }

        // Cria a instância de Moeda apropriada a partir do tipo escolhido.
        Moeda moeda = switch (tipo) {
            case 1 -> new Real(quantia);   // se tipo == 1, cria Real
            case 2 -> new Dolar(quantia);  // se tipo == 2, cria Dolar
            case 3 -> new Euro(quantia);   // se tipo == 3, cria Euro
            default -> null;               // qualquer outro tipo é inválido
        };

        // Se o tipo foi inválido, informa e retorna sem adicionar.
        if (moeda == null) {
        	System.out.println("---------------------------------------------------");
            System.out.println("\nValor inválido. Operação cancelada.\n");
            return;
        }

        // Adiciona a moeda criada no cofrinho e avisa o usuário.
        cofre.adicionar(moeda);
    	System.out.println("---------------------------------------------------"); 
        System.out.println("\nMoeda adicionada com sucesso.\n");
    }

    // Método para remover uma moeda do cofrinho.
    private static void menuRemover() {
        System.out.println("--------------- MENU REMOVER MOEDA ---------------");
        System.out.println("1 - Real (BRL)");
        System.out.println("2 - Dólar (USD)");
        System.out.println("3 - Euro (EUR)");
        System.out.print("Escolha: ");

        // Lê o tipo escolhido (1 a 3).
        int tipo = tecla.nextInt();

        // Solicita o valor da moeda a adicionar.
        System.out.print("Digite o valor: ");
        
        // Lê o valor como double (aceita casas decimais).
        double quantia = tecla.nextDouble();

        // Valida se o valor é positivo; se não for, cancela a operação.
        if (quantia <= 0) {
        	System.out.println("---------------------------------------------------");
            System.out.println("\nValor inválido. Tente novamente.\n");
            return;
        }

        // Cria uma instância temporária de Moeda para comparar e remover.
        Moeda moeda = switch (tipo) {
            case 1 -> new Real(quantia);
            case 2 -> new Dolar(quantia);
            case 3 -> new Euro(quantia);
            default -> null;
        };

        // Se tipo inválido, informa e retorna.
        if (moeda == null) {
        	System.out.println("---------------------------------------------------");
            System.out.println("\nTipo inválido. Tente novamente.\n");
            return;
        }

        // Tenta remover a moeda; o método retorna boolean indicando sucesso.
        boolean removida = cofre.remover(moeda);

        // Informa o resultado ao usuário.
        if (removida) {
        	System.out.println("---------------------------------------------------");
            System.out.println("\nMoeda removida com sucesso.\n");
        } 
        
        else {
        	System.out.println("---------------------------------------------------");
            System.out.println("\nMoeda não encontrada no cofrinho.\n");
        }
    }

}
