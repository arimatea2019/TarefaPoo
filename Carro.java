// Importa o necessário para usar LocalDateTime
import java.time.LocalDateTime;

// Define a classe Carro como uma subclasse de Veiculo
public class Carro extends Veiculo {
    // Constante estática para a tarifa cobrada por hora
    private static final double TARIFA_POR_HORA = 5.00; // Define a tarifa por hora de estacionamento como 5 reais

    // Construtor da classe Carro que recebe a placa como parâmetro
    public Carro(String placa) {
        super(placa); // Chama o construtor da classe pai (Veiculo) para inicializar a placa
    }

    // Método sobrescrito para calcular o valor a ser pago com base no tempo de estacionamento
    @Override
    public double calcularValorPago() {
        long horas = calcularTempoEstacionamento(); // Converte o tempo de estacionamento de segundos para horas
        return horas * TARIFA_POR_HORA; // Calcula o valor a ser pago multiplicando as horas pelo valor da tarifa por hora
    }
}
