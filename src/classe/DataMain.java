package classe;

public class DataMain {

    public static void main(String[] args){
        Data d1 =  new Data(24,9,2002);

        Data d2 =  new Data();
        d2.dia = 31;
        d2.mes = 12;
        d2.ano = 2021;

        Data d3 = new Data();

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();
        d3.imprimirDataFormatada();
    }

}
