package ex03;

import java.util.Arrays;
import java.util.List;

public class StatusObraMain {
    public static void main(String[] args) {
        List<StatusObra> vetorItensObra = Arrays.asList(
                new StatusObra("Operário01", true, 120.0),
                new StatusObra("Operário02", false, 140.0),
                new StatusObra("Operário03", false, 135.0),
                new StatusObra("Operário04", true, 100.0)
        );

        vetorItensObra.stream().filter(operariosArray -> !operariosArray.atividadesConcluidas)
                .map(trabalhadoresArray -> trabalhadoresArray.horasTrabalhadas+=5)
                .forEach(System.out::println);

    }
}
