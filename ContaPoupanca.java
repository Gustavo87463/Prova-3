package Banco;

public class ContaPoupanca extends ContaBancaria{

    protected int diaDeRendimento = 2;

    public ContaPoupanca(String cliente, int numConta, float saldo, int diaDeRendimento) {
        super(cliente, numConta, saldo);
        this.diaDeRendimento = diaDeRendimento;
    }

    public void CalcularNovoSaldo(){

        float rendimento = Saldo + 4000;



        
    }

    






    


    
}