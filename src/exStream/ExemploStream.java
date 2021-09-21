package exStream;

public class ExemploStream {
    String titulo;
    boolean estaReservado;
    double valorTotal;

    public ExemploStream(String nome, boolean estaEspecificado, double capacidade){
        this.titulo = nome;
        this.estaReservado = estaEspecificado;
        this.valorTotal = capacidade;
    };
}
