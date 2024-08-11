import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class DataExemplo3 {
    public static void main(String[] args) {
        // Criar uma lista de datas usando LinkedList
        List<LocalDate> datas = new LinkedList<>();
        datas.add(LocalDate.of(2023, 5, 20));
        datas.add(LocalDate.of(2021, 8, 15));
        datas.add(LocalDate.of(2024, 1, 1));
        datas.add(LocalDate.of(2022, 12, 25));

        // Classificar a lista de datas usando Bubble Sort
        bubbleSort(datas);

        // Imprimir a lista de datas classificadas
        System.out.println("Datas em ordem crescente:");
        for (LocalDate data : datas) {
            System.out.println(data);
        }
    }

    private static void bubbleSort(List<LocalDate> lista) {
        int n = lista.size();
        boolean trocou;
        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (lista.get(j).isAfter(lista.get(j + 1))) {
                    // Trocar as datas
                    LocalDate temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                    trocou = true;
                }
            }
            // Se não houve troca, a lista já está ordenada
            if (!trocou) {
                break;
            }
        }
    }
}
