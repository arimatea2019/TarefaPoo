import java.util.ArrayList;
import java.util.List;

// Define a classe Estacionamento
public class Estacionamento {
    // Atributo privado que armazena a capacidade total do estacionamento
    private int capacidade;
    // Lista para armazenar os veículos atualmente estacionados
    private List<Veiculo> veiculosEstacionados;

    // Construtor que inicializa o estacionamento com uma capacidade específica
    public Estacionamento(int capacidade) {
        this.capacidade = capacidade; // Define a capacidade do estacionamento
        this.veiculosEstacionados = new ArrayList<>(); // Inicializa a lista de veículos estacionados
    }

    // Método para adicionar um veículo ao estacionamento
    public boolean adicionarVeiculo(Veiculo veiculo) {
        // Verifica se ainda há espaço no estacionamento antes de adicionar o veículo
        if (veiculosEstacionados.size() < capacidade) {
            veiculosEstacionados.add(veiculo); // Adiciona o veículo à lista de veículos estacionados
            return true; // Retorna verdadeiro indicando sucesso na operação
        }
        return false; // Retorna falso se não houver espaço disponível
    }

    // Método para remover um veículo do estacionamento e imprimir os detalhes da saída
    public boolean removerVeiculo(String placa) {
        for (Veiculo veiculo : veiculosEstacionados) {
            if (veiculo.placa.equals(placa)) {
                veiculo.registrarSaida(); // Registra a hora de saída do veículo
                veiculo.imprimirDetalhesSaida(); // Imprime os detalhes da saída
                veiculosEstacionados.remove(veiculo); // Remove o veículo da lista
                return true; // Retorna verdadeiro indicando sucesso na remoção e impressão
            }
        }
        return false; // Retorna falso se nenhum veículo com a placa especificada foi encontrado
    }


    // Método para calcular quantas vagas estão disponíveis no estacionamento
    public int vagasDisponiveis() {
        // Retorna a diferença entre a capacidade total e o número de veículos estacionados
        return capacidade - veiculosEstacionados.size();
    }
}
