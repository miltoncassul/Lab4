public class ContaXPTO{
	String nome;
	int numConta;
	double saldo;

	ContaXPTO(String nome, int numConta, double saldo){
		this.nome = nome;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}

	public void setNumConta(int numConta){
		this.numConta = numConta;
	}
	public int getNumConta(){
		return this.numConta;
	}

	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	public double getSaldo(){
		return this.saldo;
	}

	public void Creditar(double valor){
		this.saldo = saldo + valor;
	}
	public double Debitar(double valor){
		return this.saldo = saldo - valor;
	}
    public double salarioBonus(){
    	return this.saldo * 0.2;
    }

}