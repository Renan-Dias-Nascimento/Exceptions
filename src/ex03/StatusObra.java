package ex03;

public class StatusObra {
    String nomeDoOperario;
    boolean atividadesConcluidas;
    double horasTrabalhadas;

    public StatusObra(String nome, boolean atividade, double horas) {
        this.nomeDoOperario = nome;
        this.atividadesConcluidas = atividade;
        this.horasTrabalhadas = horas;
    }

    @Override
    public String toString() {
//        formatação - %s diz que recebe String -- %b diz que recebe boolean -- %f é pra float ou double, o .2 é pra ter 2 casas depois da vírgula. no final coloca em sequencia as variáveis
        return String.format("|Título = %s | Está reservado? Resposta = %b | Valor total = %.2f", nomeDoOperario, atividadesConcluidas, horasTrabalhadas);
    }
}
