package MeuDesafio;

public class PessoaFisica extends Funcionarios {
	String cpf;
	
	public PessoaFisica(Funcionarios func, String cpf) {
		this.setNome(func.getNome());
		this.setSalario(func.getSalario());
		this.setData(func.getData());
		this.cpf = cpf;
	}
}
