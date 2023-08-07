package entities;

public class Pessoa {
	
	// Atributos
	private String nome;
	private String email;
	
	// Contrutor
	public Pessoa(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	// Getter & Setter
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}

}
