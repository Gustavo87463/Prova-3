package Banco;
public class ContaBancaria {

    protected String cliente;
    protected int numConta;
    protected float Saldo;

    public ContaBancaria(String cliente, int numConta, float saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        Saldo = saldo;
    }

    public void Sacar(float Sacar){

        float ValorScar = this.Saldo-Sacar;

        if(Sacar<=Saldo){
            System.out.println("O saque não pode ser efetuado.");

        }else{
            System.out.println("Saque feito com sucesso");
        }

        
        


    }

    public float depositar(float deposito){
        float total = Saldo + deposito;
        return total;


    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float saldo) {
        Saldo = saldo;
    }

    





    

    

    
}
