package ex01;

import java.util.Arrays;
import java.util.List;

public class ItensAreaDeLazer {
    public static void main(String[] args) {

            List<Integer> pacotesDeMateriais = Arrays.asList(1, 3, 4, 6, 8, 9, 23, 51, 14, 42, 13);

            pacotesDeMateriais.stream().filter(itensDoArray -> itensDoArray % 2 == 0).forEach(System.out::println);

            System.out.println("==================");

            List<Integer> marmita = Arrays.asList(5,8,1,4,2,6,7,9,14);

            marmita.stream().filter(tamanho -> tamanho%2 == 0).forEach(System.out::println);
    }
}

