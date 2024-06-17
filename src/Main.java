
    abstract class Conta {
        private int numeroConta;
        protected double saldo;
    
        public Conta(int numeroConta) {
            this.numeroConta = numeroConta;
            this.saldo = 0.0;
        }
    
        public int getNumeroConta() {
            return numeroConta;
        }
    
        public double getSaldo() {
            return saldo;
        }
    
        public void depositar(double valor) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado na conta " + numeroConta);
        }
    
        public void sacar(double valor) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado na conta " + numeroConta);
            } else {
                System.out.println("Saldo insuficiente para saque na conta " + numeroConta);
            }
        }
    
        public abstract void transferir(Conta destino, double valor);

        @Override
        protected Object clone() throws CloneNotSupportedException {
           
            return super.clone();
        }

        @Override
        public boolean equals(Object obj) {
            
            return super.equals(obj);
        }

        @SuppressWarnings("deprecation")
        @Override
        protected void finalize() throws Throwable {
            
            super.finalize();
        }

        @Override
        public int hashCode() {
           
            return super.hashCode();
        }

        @Override
        public String toString() {
            
            return super.toString();
        }
    }
    


    public class Main {
        public static void main(String[] args) {
            // Criando uma conta corrente e uma poupança
            ContaCorrente contaCorrente = new ContaCorrente(12345, 10.0); // número da conta e taxa de manutenção
            ContaPoupanca contaPoupanca = new ContaPoupanca(54321, 0.5);  // número da conta e taxa de rendimento
    
            // Depositando dinheiro nas contas
            contaCorrente.depositar(1000.0);
            contaPoupanca.depositar(500.0);
    
            // Realizando saques
            contaCorrente.sacar(100.0);
            contaPoupanca.sacar(50.0);
    
            // Transferindo dinheiro entre contas
            contaCorrente.transferir(contaPoupanca, 200.0);
    
            // Mostrando saldo final das contas
            System.out.println("Saldo conta corrente: R$" + contaCorrente.getSaldo());
            System.out.println("Saldo conta poupança: R$" + contaPoupanca.getSaldo());
        }
    }
    
