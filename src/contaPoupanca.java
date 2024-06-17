
class ContaPoupanca extends Conta {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        
        return super.clone();
    }

    @Override
    public void depositar(double valor) {
        
        super.depositar(valor);
    }

    @Override
    public boolean equals(Object obj) {
        
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        
        super.finalize();
    }

    @Override
    public int getNumeroConta() {
        
        return super.getNumeroConta();
    }

    @Override
    public double getSaldo() {
        
        return super.getSaldo();
    }

    @Override
    public int hashCode() {
       
        return super.hashCode();
    }

    @Override
    public void sacar(double valor) {
        
        super.sacar(valor);
    }

    @Override
    public String toString() {
        
        return super.toString();
    }

    private double taxaRendimento;

    public ContaPoupanca(int numeroConta, double taxaRendimento) {
        super(numeroConta);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void transferir(Conta destino, double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada da conta " + getNumeroConta() + " para conta " + destino.getNumeroConta());
        } else {
            System.out.println("Saldo insuficiente para transferência da conta " + getNumeroConta());
        }
    }

    // Métodos específicos da conta poupança, se houver necessidade
}


