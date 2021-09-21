package exStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ExemploStream> membros = Arrays.asList(
                new ExemploStream("Membro01 ", true, 1500.0),
                new ExemploStream("Membro02 ", false, 1750.0),
                new ExemploStream("Membro03 ", true, 2000.0),
                new ExemploStream("Membro04 ", false, 2250.0)
        );

        List<Integer> valores = Arrays.asList(3,5,7,4,9,15,12,19,22,25);


        valores.stream().filter(items -> items%2 == 0).forEach(System.out::println);

        membros.stream().filter(member -> member.estaReservado).map(filteredMember -> filteredMember.valorTotal
                +=500).forEach(System.out::println);
    }
}
