package model;

public class Impiegato {

	private String nome;
	private String cognome;
	private double salario;

	public Impiegato(String nome, String cognome, double salario) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Impiegato [nome=" + nome + ", cognome=" + cognome + ", salario=" + salario + "]";
	}

	public  void aumentaSalario (int percentuale) {
		salario = (salario + (salario * percentuale) /100);
		
	}
	
	
}
