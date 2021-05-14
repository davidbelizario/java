package escola;

public class Professor extends Pessoa {
	String matricula, datacontratacao;
	double salario;
	
	public Professor() {
		this.cpf="234.567.890-12";
		this.nome="Josué Ribeiro";
		this.matricula="45678-9";
		this.salario = 4500.00;
	}
	
	public double AtualizarSalario() {
		this.salario = this.salario + this.salario * 10 / 100;
		System.out.println("Salário professor atualizado: " + this.salario);
		return this.salario;
	}
}


