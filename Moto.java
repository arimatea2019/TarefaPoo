// Define a classe Moto como uma subclasse de Veiculo, herdando seus métodos e atributos
public class Moto extends Veiculo {
    // Define a tarifa por hora como constante e estática para todas as instâncias de Moto
    private static final double TARIFA_POR_HORA = 2.50; // A tarifa por hora para estacionamento de motos é R$2,50

    // Construtor da classe Moto que recebe a placa do veículo como argumento
    public Moto(String placa) {
        super(placa); // Chama o construtor da superclasse Veiculo para inicializar a placa
    }

    // Sobrescreve o método abstrato calcularValorPago da classe Veiculo para fornecer uma implementação específica para Moto
    @Override
    public double calcularValorPago() {
        long horas = calcularTempoEstacionamento(); // Converte o tempo de estacionamento de segundos para horas
        return horas * TARIFA_POR_HORA; // Calcula o custo do estacionamento multiplicando as horas pelo valor da tarifa por hora
    }
}
