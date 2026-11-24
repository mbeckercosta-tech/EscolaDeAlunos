package Entities;

public class Professor {
    boolean empregado;
    String nome;

    public void CalcularMedia (Aluno aluno) {
        double prova1 = aluno.getNotaProvaJojos();
        double prova2 = aluno.getNotaProvaNaruto();
        double trabalho = aluno.getNotaTrabalhoHXH();
        double media = aluno.getMedia();






    }

    public void AplicarProvaFinal(Aluno aluno) {
        double media = aluno.getMedia();
        if (media >= 6) {
            System.out.println("aluno aprovado, sem prova final");


        }
        else System.out.println("prova final necessaria!");

    }

    public Professor(boolean empregado, String nome, int notaProvaNaruto){
        this.empregado = empregado;
        this.nome = nome;


    }

    }


