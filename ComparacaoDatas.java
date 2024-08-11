import java.time.LocalDate;

public class ComparacaoDatas {
    public static void main(String[] args) {
        // Criar duas datas
        LocalDate data1 = LocalDate.of(2023, 5, 20);
        LocalDate data2 = LocalDate.of(2024, 1, 1);

        // Comparar as datas
        if (data1.isBefore(data2)) {
            System.out.println(data1 + " é antes de " + data2);
        } else if (data1.isAfter(data2)) {
            System.out.println(data1 + " é depois de " + data2);
        } else {
            System.out.println(data1 + " é igual a " + data2);
        }

        // Alternativamente, você pode usar o método compareTo
        int comparacao = data1.compareTo(data2);
        if (comparacao < 0) {
            System.out.println(data1 + " é antes de " + data2);
        } else if (comparacao > 0) {
            System.out.println(data1 + " é depois de " + data2);
        } else {
            System.out.println(data1 + " é igual a " + data2);
        }
    }
}
