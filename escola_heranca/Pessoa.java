package escola;

public class Pessoa {
	String cpf, nome, datanascimento, endereco, telefonecelular;
	
	public boolean VerificarCPF()
	{
		System.out.println("Verifica��o CPF executada: " + this.cpf);
		return true;
	}
}

