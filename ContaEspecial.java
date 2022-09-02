package Banco;

public class ContaEspecial extends ContaBancaria{

    public ContaEspecial(String cliente, int numConta, float saldo) {
        super(cliente, numConta, saldo);
        //TODO Auto-generated constructor stub
    }

    protected double limite  = -5000;

    public float sacar(float dinSacado){
        
        if(limite < dinSacado){
            System.out.println("Não é possivel sacar este valor");
            return 0;
        }else{
            float total = Saldo - dinSacado;
            return total;
        }

    }  









}
 