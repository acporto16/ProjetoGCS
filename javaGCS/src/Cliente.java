public class Cliente {
	
    private String nome;
    private double saldo;

    public Cliente(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double valor){
        this.saldo += valor;
        return this.saldo;
    }
    
    public double retirar(double valor){
        if ((this.saldo - valor) > 0){
            this.saldo -=valor;
            return this.saldo;
        }
        System.out.println("O cliente não possui saldo suficiente para retirada (saque/transferência).");
        return 0.0;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
