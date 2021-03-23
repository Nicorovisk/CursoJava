package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int qtdAlunos = scanner.nextInt();

        System.out.print("Digite a quantidade de notas: ");
        int qtdNotas = scanner.nextInt();

        double[][] notasDaTurma =  new double[qtdAlunos][qtdNotas];

        double total = 0;
        for(int a = 0; a < notasDaTurma.length; a++){
            for(int n = 0; n <  notasDaTurma[a].length; n++){
                System.out.printf("Digite a nota %d do aluno %d: ", n+1 ,a+1);
                notasDaTurma[a][n] = scanner.nextDouble();
                total += notasDaTurma[a][n];
            }
        }
        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("A média da turma é: "+media);

        for(double[] notasDoAluno : notasDaTurma){
            System.out.println(Arrays.toString(notasDoAluno));
        }

        scanner.close();
    }
}
