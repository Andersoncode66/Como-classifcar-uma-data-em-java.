import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Comparator;

public class DataExemplo2 {
    public static void main(String[] args) {
        // Criar uma lista de datas usando LinkedList
        List<LocalDate> datas = new LinkedList<>();
        datas.add(LocalDate.of(2023, 5, 20));
        datas.add(LocalDate.of(2021, 8, 15));
        datas.add(LocalDate.of(2024, 1, 1));
        datas.add(LocalDate.of(2022, 12, 25));

        // Classificar a lista de datas em ordem crescente
        datas.sort(Comparator.naturalOrder());

        // Imprimir a lista de datas classificadas
        System.out.println("Datas em ordem crescente:");
        for (LocalDate data : datas) {
            System.out.println(data);
        }

        // Classificar a lista de datas em ordem decrescente
        datas.sort(Comparator.reverseOrder());

        // Imprimir a lista de datas classificadas em ordem decrescente
        System.out.println("\nDatas em ordem decrescente:");
        for (LocalDate data : datas) {
            System.out.println(data);
        }
    }
}
