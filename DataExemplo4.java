public class DataExemplo4 {
    public static void main(String[] args) {
        // Declarar e inicializar variáveis
        int a = 10;
        int b = 5;

        // Calcular a soma
        int resultado = a + b;
        System.out.println("Soma: " + resultado);

        // Reutilizar a variável resultado para armazenar a diferença
        resultado = a - b;
        System.out.println("Diferença: " + resultado);

        // Reutilizar a variável resultado para armazenar o produto
        resultado = a * b;
        System.out.println("Produto: " + resultado);

        // Se precisar calcular a divisão, você pode adicionar outra variável
        double divisao = (double) a / b;
        System.out.println("Divisão: " + divisao);
    }
}
