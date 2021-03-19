package classe;

public class AreaCirc {

    double raio;
    final static double PI = 3.1415;

     AreaCirc(double raioInicial){
        raio = raioInicial;
     }

     double calcularArea(){
         return raio*raio*PI;
     }
}
