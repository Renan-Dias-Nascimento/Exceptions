package ex01;

public class Sample {
    String titulo;
    boolean estaReservado;
    double valorTotal;

    public Sample(String nome, boolean estaEspecificado, double capacidade){
        this.titulo = nome;
        this.estaReservado = estaEspecificado;
        this.valorTotal = capacidade;
    };

    @Override
    public String toString(){
        return "| Titulo = " + titulo + "| Está reservado? Resposta = " + estaReservado + "| Valor total = " + valorTotal;
    }
}
