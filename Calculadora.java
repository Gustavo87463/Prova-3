package CalculadoraProva;
public class Calculadora {

    

    public static  void Somar(Double numero1, Double numero2){

        

        double Somar = numero1+numero2;
        System.out.println(Somar);

    }

    public static void subtrair(Double numero1, Double numero2){

        double subtrair = numero1-numero2;
        System.out.println(subtrair);

    }
    
    public static void multiplicar(double numero1, double numero2){

        double multiplicar = numero1*numero2;
        System.out.println(multiplicar);


    }

    public static void dividir(double numero1, double numero2){

        

        if(numero2==0){
            System.out.println("Não é possivel dividir por zero.");

        }else{
            double dividir = numero1/numero2;
            System.out.println(dividir);
        }

    }

    public static void mod(double numero1, double numero2){

        double mod = numero1%numero2;
        System.out.println(mod);

    }




}
