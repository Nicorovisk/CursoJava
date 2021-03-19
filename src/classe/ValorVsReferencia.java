package classe;

public class ValorVsReferencia {

    public static void main(String[] args){
        double a = 2;
        double b = a; // atribuição por valor

        a++;
        b--;

        System.out.println("A: "+a);
        System.out.println("B: "+b);

        Data d1 = new Data(1,6,2022);
        Data d2 = d1; // atribuição por objeto

        d1.mes = 12;
        d2.ano = 2077;

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();

        voltarDataParaValorPadrao(d1);

        d1.imprimirDataFormatada();
        d1.imprimirDataFormatada();
    }

    static void voltarDataParaValorPadrao(Data d){

        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;

    }

}
