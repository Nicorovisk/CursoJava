package arrays.desafios;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanhoArray;

        System.out.print("Digite a quantidade de notas que deseja inserir: ");
        tamanhoArray = scanner.nextInt();
        System.out.println();

        double[] notas = new double[tamanhoArray];

        for(int i = 0; i < tamanhoArray; i++){
            System.out.print("Digite a "+(i+1)+"ª nota:");
            notas[i] = scanner.nextDouble();
            System.out.println();
        }
        System.out.println(Arrays.toString(notas));

        double total = 0;
        for(double nota:notas){
            total += nota;
        }

        System.out.println("Média: "+total/tamanhoArray);
        scanner.close();

    }
}
