package CalculadoraProva;
import java.util.Scanner;

public class Exercicio01{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Calculadora calculadora = new Calculadora();

        System.out.println("Digite um numero:");
        double numero1 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Digite o que deseja fazer");
        String op = entrada.nextLine();

        System.out.println("Digite o segundo numero");
        double numero2 = entrada.nextDouble();

        
        if(op.equals("+")){
           calculadora.Somar(numero1, numero2);
        }else if(op=="-"){
            calculadora.subtrair(numero1, numero2);
        }else if(op=="*"){
           calculadora.multiplicar(numero1, numero2);
        }else if(op=="/"){
            calculadora.dividir(numero1, numero2);
        }else if (op=="%"){
           calculadora.mod(numero1, numero2);
        }
        


    }
}