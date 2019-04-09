//import ContaXPTO.
public class Main {
	public static void main(String[] args){
		ContaXPTO conta = new ContaXPTO("Milton",1,10.0);
		System.out.println("Saldo atual: " + conta.getSaldo());
		conta.Debitar(5.0);
		System.out.println("Bonus adquirido "+ conta.salarioBonus());
		System.out.println("Saldo restante: " + conta.getSaldo());
	}
}