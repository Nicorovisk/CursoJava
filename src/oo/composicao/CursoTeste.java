package oo.composicao;

public class CursoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Pedro");
        Aluno aluno3 =  new Aluno("Maria");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("React Native");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        curso3.adicionarAluno(aluno2);
        curso3.adicionarAluno(aluno3);

        for (Aluno aluno: curso2.alunos){
            System.out.println("Estou matriculado no curso " + curso2.nome + "...");
            System.out.println("...e o meu nome é " + aluno.nome);
            System.out.println();
        }
    }
}
