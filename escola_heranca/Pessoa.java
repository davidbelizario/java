package escola;

public class Pessoa {
	String cpf, nome, datanascimento, endereco, telefonecelular;
	
	public boolean VerificarCPF()
	{
		System.out.println("Verificação CPF executada: " + this.cpf);
		return true;
	}
}

