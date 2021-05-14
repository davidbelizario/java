package escola;

public class Escola {
	
	public static void main(String[] args) {
		Aluno a = new Aluno();
		System.out.println("----- Dados do aluno -----");
		System.out.println("Nome: " + a.nome);
		System.out.println("CPF: " + a.cpf);
		System.out.println("Data de ingresso: " + a.dataingresso);
		System.out.println("Curso: " + a.curso);
		a.VerificarCPF();
		a.MudarCurso();
		
		Professor p = new Professor();
		System.out.println("---- Dados do professor ----");
		System.out.println("Nome: " + p.nome);
		System.out.println("CPF: " + p.cpf);
		System.out.println("Matrícula: " + p.matricula);
		System.out.println("Salário: " + p.salario);
		p.VerificarCPF();
		p.AtualizarSalario();
	}
}
