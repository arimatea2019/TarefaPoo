import java.time.LocalDateTime;

// Declaração da classe abstrata Veiculo
public abstract class Veiculo {
    // Atributos protegidos, acessíveis pelas subclasses
    protected String placa; // Placa do veículo
    protected LocalDateTime horaEntrada; // Data e hora da entrada do veículo no estacionamento
    protected LocalDateTime horaSaida; // Data e hora da saída do veículo do estacionamento

    // Construtor da classe Veiculo, que inicializa a placa e a hora de entrada
    public Veiculo(String placa) {
        this.placa = placa; // Atribui a placa do veículo
        this.horaEntrada = LocalDateTime.now(); // Configura a hora atual como a hora de entrada
    }

    // Método para registrar a entrada do veículo, atualizando a hora de entrada
    public void registrarEntrada() {
        this.horaEntrada = LocalDateTime.now(); // Atualiza a hora de entrada para o momento atual
    }

    // Método para registrar a saída do veículo, atualizando a hora de saída
    public void registrarSaida() {
        this.horaSaida = LocalDateTime.now(); // Atualiza a hora de saída para o momento atual
    }

    // Método para calcular o tempo total de estacionamento em segundos
    public long calcularTempoEstacionamento() {
        return java.time.Duration.between(horaEntrada, horaSaida).getSeconds(); // Calcula a diferença em segundos entre a entrada e a saída
    }

    // Método abstrato para calcular o valor a ser pago, deve ser implementado pelas subclasses
    public abstract double calcularValorPago();

    // Método para imprimir os detalhes no momento da saída
    public void imprimirDetalhesSaida() {
        long tempoPermanencia = calcularTempoEstacionamento(); // Calcula o tempo em segundos
        double valorPago = calcularValorPago(); // Calcula o valor a ser pago
        System.out.println("Placa: " + placa +
                ", Tempo de Permanência: " + tempoPermanencia + " segundos" +
                ", Valor a Pagar: R$" + valorPago);
    }

}
