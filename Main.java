import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Cria um estacionamento com 10 vagas
        Estacionamento estacionamento = new Estacionamento(10);

        // Loop infinito até que o usuário escolha sair
        while (true) {
            // Apresenta opções ao usuário
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Entrar veículo");
            System.out.println("2 - Sair veículo");
            System.out.println("3 - Verificar vagas disponíveis");
            System.out.println("4 - Sair do programa");

            // Lê a opção escolhida pelo usuário
            int opcao = scanner.nextInt();
            // Limpa o buffer do scanner após ler um número
            scanner.nextLine();

            // Trata as opções com base no que o usuário escolheu
            switch (opcao) {
                case 1:
                    // Opção para adicionar um veículo
                    System.out.println("Digite 'carro' ou 'moto' e a placa do veículo:");
                    String tipo = scanner.next(); // Lê o tipo de veículo
                    String placa = scanner.next(); // Lê a placa do veículo
                    Veiculo veiculo = null;

                    // Cria um objeto carro ou moto dependendo da entrada
                    if (tipo.equalsIgnoreCase("carro")) {
                        veiculo = new Carro(placa);
                    } else if (tipo.equalsIgnoreCase("moto")) {
                        veiculo = new Moto(placa);
                    }

                    // Tenta adicionar o veículo ao estacionamento
                    if (veiculo != null && estacionamento.adicionarVeiculo(veiculo)) {
                        System.out.println("Veículo adicionado com sucesso.");
                    } else {
                        System.out.println("Falha ao adicionar veículo. Estacionamento cheio ou tipo inválido.");
                    }
                    break;

                case 2:
                    // Opção para remover um veículo
                    System.out.println("Digite a placa do veículo para sair:");
                    placa = scanner.next(); // Lê a placa do veículo que será removido
                    if (estacionamento.removerVeiculo(placa)) {
                        System.out.println("Veículo removido com sucesso.");
                    } else {
                        System.out.println("Veículo não encontrado.");
                    }
                    break;

                case 3:
                    // Opção para verificar vagas disponíveis
                    System.out.println("Vagas disponíveis: " + estacionamento.vagasDisponiveis());
                    break;

                case 4:
                    // Opção para sair do programa
                    System.out.println("Encerrando o programa...");
                    scanner.close(); // Fecha o scanner antes de sair
                    return; // Encerra a execução

                default:
                    // Caso a opção digitada não seja válida
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        }
    }
}
