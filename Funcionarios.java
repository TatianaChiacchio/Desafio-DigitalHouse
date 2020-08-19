package MeuDesafio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Funcionarios {
	private String nome;
	private double salario;
	private String dataAdmissao;
	
	public Funcionarios(String nome, double salario, String dataAdm) {
		this.nome = nome;
		this.salario = salario;
		this.dataAdmissao = dataAdm;
	}
	
	public Funcionarios() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}
	
	public String getData() {
		return dataAdmissao;
	}
	
	public void setData(String dataAdm) {
		this.dataAdmissao = dataAdm;
	}

	public void setSalario(double salario) {
		if(salario >= this.salario) {
			this.salario = salario;
		}else {
			System.out.println("O salário não pode ser reajustado para um valor menor que o atual");
		}
	}
	
	public void requistarFerias(String dataAdm, String dataRequisicao, String ultimaFerias) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date dataInicio = format.parse(dataAdm);
		Date dataFim = format.parse(dataRequisicao);
		Date dataUltima = format.parse(ultimaFerias); 
		
		final double MES_EM_MILISEGUNDOS = 30.0 * 24.0 * 60.0 * 60.0 * 1000.0;
		//final double MES_EM_MILISEGUNDOS = 2592000000.0;
		
		double numeroDeMeses = (double)((dataFim.getTime() - dataInicio.getTime())/MES_EM_MILISEGUNDOS);
		double numeroDeMeses2 = (double)((dataFim.getTime() - dataUltima.getTime())/MES_EM_MILISEGUNDOS);
		
		numeroDeMeses = (int)numeroDeMeses;
		numeroDeMeses2 = (int)numeroDeMeses2;
		
		if ((numeroDeMeses >= 11) && (numeroDeMeses2 >= 4)){
			System.out.println("Numero de meses da admissão: "+numeroDeMeses + " meses  / Tempo das últimas férias: " + numeroDeMeses2 + " meses - Férias liberadas");
		}else {
			System.out.println("Numero de meses da admissão: "+numeroDeMeses + " meses  / Tempo das últimas férias: " + numeroDeMeses2 + " meses - Férias negadas");
		}
	}
}
	