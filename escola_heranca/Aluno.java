package escola;

public class Aluno extends Pessoa {
	String ra, dataingresso, curso;
	double notavestibular;


	public Aluno() {
		this.cpf = "012.345.678-90";
		this.nome = "Marcos Silveira";
		this.dataingresso = "10/02/2020";
		this.curso = "Banco de dados";
	}
	
	public String MudarCurso()
	{
		curso = "Analise e desenvolvimento de sistemas";
		System.out.println("Curso de aluno alterado para: " + this.curso);
		return this.curso;
	}
}
