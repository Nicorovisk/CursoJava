package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
    public static void main(String[] args){

        Ferrari ferrari = new Ferrari(450);
        Civic civic = new Civic(250);

        System.out.println("Velocidade civic: " + civic.velocidadeAtual+"km/h");
        System.out.println("Velocidade ferrari: " + ferrari.velocidadeAtual+"km/h");

        civic.acelerar(100,5);
        civic.frear();

        ferrari.acelerar(100,15);
        ferrari.frear();

        System.out.println("Velocidade civic: " + civic.velocidadeAtual+"km/h");
        System.out.println("Velocidade ferrari: " + ferrari.velocidadeAtual+"km/h");

    }
}
