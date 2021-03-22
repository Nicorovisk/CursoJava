package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args){

        double[] notasAlunoA =  new double[4];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 9.0;
        notasAlunoA[1] = 8.5;
        notasAlunoA[2] = 8.0;
        notasAlunoA[3] = 7.0;

        System.out.println(Arrays.toString(notasAlunoA));

        double totalAlunoA = 0;
        for(int i = 0; i < notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
        }

        System.out.println(totalAlunoA/notasAlunoA.length);

        double[] notasAlunoB = {6.0, 7.0, 5.0, 6.75} ;
        double totalAlunoB = 0;
        for(int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println(totalAlunoB/notasAlunoB.length);
    }


}
