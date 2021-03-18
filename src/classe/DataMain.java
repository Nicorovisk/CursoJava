package classe;

public class DataMain {

    public static void main(String[] args){
        Data d1 =  new Data();
        d1.dia = 24;
        d1.mes = 9;
        d1.ano = 2002;

        Data d2 =  new Data();
        d2.dia = 31;
        d2.mes = 12;
        d2.ano = 2021;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }

}
