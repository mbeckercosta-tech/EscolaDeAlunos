package Entities;

public class Aluno {
    boolean matriculado;
    String nome;
    private final double notaProvaNaruto;
    private final double notaProvaJojos;
    private final double notaTrabalhoHXH;
    private double media;


    public double getNotaProvaNaruto() {
        return notaProvaNaruto;
    }

    public void setNotaProvaNaruto(double notaProvaNaruto) {
        notaProvaNaruto = notaProvaNaruto;
    }

    public double getNotaProvaJojos() {
        return notaProvaJojos;
    }

    public void setNotaProvaJojos(double notaProvaJojos) {
        notaProvaJojos = notaProvaJojos;
    }

    public double getNotaTrabalhoHXH() {
        return notaTrabalhoHXH;
    }

    public void setNotaTrabalhoHXH(double notaTrabalhoHXH) {
        notaTrabalhoHXH = notaTrabalhoHXH;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }


    public Aluno(boolean matriculado, String nome, int notaProvaJojos, int notaProvaNaruto, int notaTrabalhoHXH, int notaFinal) {
        this.matriculado = matriculado;
        this.nome = nome;
        this.notaProvaJojos = notaProvaJojos;
        this.notaProvaNaruto = notaProvaNaruto;
        this.notaTrabalhoHXH = notaTrabalhoHXH;
        this.media = media;

    }
}


