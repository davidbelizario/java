package Banco;

public class Conta {
	String nome, cpf;
	int agencia, contaa;
	static double saldo, limite;
	


	Conta(){
		System.out.println("---- Dados e Saldos Iniciais ----");
		this.nome = "Ronaldo Arruda";
		this.cpf = "123.456.789-00";
		this.agencia = 3572;
		this.contaa = 100253;
		Conta.saldo = 500;
		Conta.limite = 1000;
		System.out.println("Nome = " + nome);
		System.out.println("cpf = " + cpf);
		System.out.println("agencia = " + agencia);
		System.out.println("conta = " + contaa);
		System.out.println("saldo conta inicial = " + Conta.saldo);
		System.out.println("saldo limiite inicial= " + Conta.limite);
		
	}
	
	Conta(double valor_movimentado){
		System.out.println("---- Movimento da Conta ----");
		System.out.println("Valor Movimentado:" + valor_movimentado);
		
		if(valor_movimentado > (saldo + limite)) {
			System.out.println("Saldo Conta Atualizado:" + saldo);
			System.out.println("Saldo do limite:" + Conta.limite);
			System.out.println("Saque Inválido");
		} 
		else{
			saldo = saldo + valor_movimentado;
			System.out.println("Saldo Conta Atualizado:" + saldo);
			if (saldo > 0) {
				limite = 1000;
				System.out.println("Saldo do limite:" + limite);
			} 
			else if (saldo < 0){
				limite = limite + saldo;
				System.out.println("Saldo do limite:" + limite);
			}
		
			
		}
		
		
	}
}
