package arrayList.agenda;

public class Contato {
	//Atributos
	private String nome, numero;
	
	
	//Metodos Especiais
	public Contato(String nome, String numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return this.nome;
	}
	
	//Metodos
	public String toString() {
		return ("Nome: " + this.nome + "\nNumero: " + this.numero);
	}
	
	public boolean equals(Object obj) {
		if ( !(obj instanceof Contato) ) return false;
		if ( this == obj )				 return true;
		
		Contato ct = (Contato) obj;
		return (nome.equalsIgnoreCase(ct.nome) && 
				numero.equalsIgnoreCase(ct.numero));
	}
	
	public Contato clone() {
		return new Contato(this.nome, this.numero);
	}
}
