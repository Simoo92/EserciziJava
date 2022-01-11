package model;

public class Persona {

	private String nome;
	private String cognome;
	private int et�;
	
	public Persona(String nome, String cognome, int et�) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.et� = et�;
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

	public int getEt�() {
		return et�;
	}

	public void setEt�(int et�) {
		this.et� = et�;
	}

	@Override
	public String toString() {
		return "Persona [nome =" + nome + ", cognome =" + cognome + ", et� =" + et� + "]";
	}
	
	
	
	
	
	
}
