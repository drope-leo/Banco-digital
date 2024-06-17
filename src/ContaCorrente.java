

class ContaCorrente extends Conta {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub
        super.depositar(valor);
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int getNumeroConta() {
        // TODO Auto-generated method stub
        return super.getNumeroConta();
    }

    @Override
    public double getSaldo() {
        // TODO Auto-generated method stub
        return super.getSaldo();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public void sacar(double valor) {
        // TODO Auto-generated method stub
        super.sacar(valor);
    }

    @Override
    public String toString() {
        
        return super.toString();
    }

    private double taxaManutencao;

    public ContaCorrente(int numeroConta, double taxaManutencao) {
        super(numeroConta);
        this.taxaManutencao = taxaManutencao;
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

   
}




