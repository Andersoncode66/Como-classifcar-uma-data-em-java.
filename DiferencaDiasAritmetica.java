import java.time.LocalDate;

public class DiferencaDiasAritmetica {
    public static void main(String[] args) {
        // Declarar e inicializar as datas
        LocalDate dataInicio = LocalDate.of(2024, 1, 1);
        LocalDate dataFim = LocalDate.of(2024, 8, 9);

        // Converter as datas para o número de dias desde 1º de janeiro de 1970
        long diasInicio = dataInicio.toEpochDay();
        long diasFim = dataFim.toEpochDay();

        // Calcular a diferença em dias
        long diferencaDias = diasFim - diasInicio;

        // Imprimir a diferença em dias
        System.out.println("Diferença em dias: " + diferencaDias);
    }
}
